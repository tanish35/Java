import java.lang.reflect.*;

class F1Driver {
    private String name;
    private int age;

    public F1Driver() {
        this.name = "Default Driver";
        this.age = 0;
    }

    public F1Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm F1 driver " + name);
    }

    private void teamSecret() {
        System.out.println("This is a confidential strategy discussion.");
    }
}

public class q4 {
    public static void main(String[] args) throws Exception {
        F1Driver driver = new F1Driver("Lewis Hamilton", 39);
        Class<?> cls = driver.getClass();

        System.out.println("Public methods:");
        for (Method m : cls.getMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> c : cls.getConstructors()) {
            System.out.println(c);
        }

        System.out.println("\nInvoking private method:");
        Method secret = cls.getDeclaredMethod("teamSecret");
        secret.setAccessible(true);
        secret.invoke(driver);

        System.out.println("\nAccessing private field 'name':");
        Field nameField = cls.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("Before change: " + nameField.get(driver));
        nameField.set(driver, "Max Verstappen");
        System.out.println("After change: " + nameField.get(driver));

        System.out.println("\nInvoking public method:");
        Method sayHello = cls.getMethod("introduce");
        sayHello.invoke(driver);
    }
}
