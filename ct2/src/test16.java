import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;

class Demo16 {
    final String str = "Hello";
}

public class test16 {
    public static void main(String[] args) {
        Demo16 demo = new Demo16();

        try {
            // // 1. Get the 'str' field from Demo16
            // Field field = Demo16.class.getDeclaredField("str");
            // field.setAccessible(true);

            // // 4. Set new value
            // field.set(demo, "Hello World");

            // // 5. Print the new value
            // System.out.println("Field value after modification: " + field.get(demo));
            // System.out.println("Field name: " + field.getName());
            // System.out.println("Demo16.str: " + demo.str);

            Class<?> sClass = String.class;
            Method m1 = sClass.getDeclaredMethod("length");
            System.out.println("Method name: " + m1.getName());
            System.out.println("Method return type: " + m1.getReturnType());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
