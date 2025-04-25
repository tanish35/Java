import java.lang.reflect.*;
import java.util.Arrays;

public class test7 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Target.class;

        System.out.println("=== Class Info ===");
        System.out.println("Name: " + clazz.getName());
        System.out.println("Modifiers: " + Modifier.toString(clazz.getModifiers()));
        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        System.out.println("\n=== Constructors ===");
        for (Constructor<?> cons : clazz.getDeclaredConstructors()) {
            System.out.println(cons);
        }

        System.out.println("\n=== Fields ===");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field + " (Modifiers: " + Modifier.toString(field.getModifiers()) + ")");
        }

        System.out.println("\n=== Methods ===");
        Method[] methods = clazz.getDeclaredMethods();
        // for (Method method : methods) {
        // System.out.println(method + " (Modifiers: " +
        // Modifier.toString(method.getModifiers()) + ")");
        // }
        int n = methods.length;
        for (int i = 0; i < n; i++) {
            System.out.println(methods[i]);
        }

        // ===== Instantiate Target using private constructor =====
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object obj = constructor.newInstance("Secret Message");

        // ===== Modify private final field =====
        Field finalField = clazz.getDeclaredField("finalValue");
        finalField.setAccessible(true);
        finalField.setInt(obj, 999); // overwrite final field

        // ===== Modify static field =====
        Field staticField = clazz.getDeclaredField("staticVal");
        staticField.setAccessible(true);
        staticField.set(null, 777);

        System.out.println("\nModified staticVal: " + staticField.get(null));

        // ===== Access and modify public field =====
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "Reflection Hero");

        System.out.println("Modified name field: " + nameField.get(obj));

        // ===== Invoke private method with no args =====
        Method privateMethod = clazz.getDeclaredMethod("printMessage");
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj);

        // ===== Invoke public method with parameters =====
        Method greetCustom = clazz.getDeclaredMethod("greetWith", String.class);
        greetCustom.invoke(obj, "Reflection!");

        // ===== Dynamically invoke any method by name =====
        System.out.println("\n=== Invoking all declared methods ===");
        for (Method method : clazz.getDeclaredMethods()) {
            method.setAccessible(true);
            if (method.getParameterCount() == 0) {
                method.invoke(obj);
            } else if (method.getParameterCount() == 1 && method.getParameterTypes()[0] == String.class) {
                method.invoke(obj, "Dynamic Call");
            }
        }

        // ===== Reflect array example =====
        int[] arr = (int[]) Array.newInstance(int.class, 5);
        for (int i = 0; i < Array.getLength(arr); i++) {
            Array.set(arr, i, i * 3);
        }
        System.out.println("Array contents via reflection: " + Arrays.toString(arr));

        // ===== Annotation check =====
        if (clazz.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann = clazz.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation value: " + ann.value());
        }
    }
}

// ================= Target Class =================
@MyAnnotation("Reflected Class")
class Target {
    private final int finalValue = 42;
    public String name = "Default";
    private static int staticVal = 5;

    private Target(String msg) {
        System.out.println("Private constructor called with: " + msg);
    }

    private void printMessage() {
        System.out.println("Final value is: " + finalValue);
    }

    public void greet() {
        System.out.println("Hello from Target!");
    }

    public void greetWith(String message) {
        System.out.println("Custom Greeting: " + message);
    }
}

// ================= Custom Annotation =================
@interface MyAnnotation {
    String value();
}
