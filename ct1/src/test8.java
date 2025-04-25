interface B1 {
    default void show() {
        System.out.println("B1");
    }
}

interface B2 {
    default void show() {
        System.out.println("B2");
    }
}

class Base implements B1, B2 {

    private int a, b;

    Base(int x, int y) {
        a = x;
        b = y;
    }

    public void show() {
        B2.super.show();
    }

    void display() {
        System.out.println("Base");
    }
}

class Child extends Base {
    Child(int x, int y) {
        super(x, y);
    }

    void display() {
        System.out.println("Child");
    }

    void crazy() {
        System.out.println("Crazy");
    }
}

public class test8 {

    public static void main(String[] args) {
        // Base obj = new Base();
        // obj.show();
        Base obj = new Child(1, 2);
        ((Child) obj).crazy();
        // obj.display();
    }

}
