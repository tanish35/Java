import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}

public class test14 {
    public static void main(String[] args) {

        Person person = new Person("John", 30);

        Class<?> personClass = person.getClass();
        Class<?> personClass2 = Person.class;

        System.out.println(personClass2);

        System.out.println("Class Name: " + personClass.getName());
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getName());
            Class<?>[] parameterTypes = method.getParameterTypes();
            System.out.print("Parameter Types: ");
            for (Class<?> paramType : parameterTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
        Constructor[] constructors = personClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor Name: " + constructor.getName());
            Class<?>[] paramTypes = constructor.getParameterTypes();
            System.out.print("Parameter Types: ");
            for (Class<?> paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType().getName());
        }
        Class<?> superClass = personClass.getSuperclass();
        System.out.println("Superclass Name: " + superClass.getName());
        Class<?>[] interfaces = personClass.getInterfaces();
        System.out.print("Implemented Interfaces: ");
        for (Class<?> iface : interfaces) {
            System.out.print(iface.getName() + " ");
        }

        try {
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true);
            System.out.println("Name: " + nameField.get(person));

            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);
            System.out.println("Age: " + ageField.get(person));

            nameField.set(person, "Jane");
            ageField.set(person, 25);

            System.out.println("Updated Name: " + nameField.get(person));
            System.out.println("Updated Age: " + ageField.get(person));
        } catch (Exception e) {
            e.printStackTrace();

        }

        try {
            String s = "Hello";
            Class<?> sClass = s.getClass();
            Method m1 = sClass.getMethod("toUpperCase");

            // String s2 = "HELLO";
            System.out.println("EqualsIgnoreCase: " + m1.invoke(s));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}