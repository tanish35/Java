class Base {
    protected void display() {
        System.out.println("Base display()");
    }

    private void print() {
        System.out.println("Base print()");
    }
}

class Derived extends Base {
    public void display() {
        System.out.println("Derived display()");
    }

    public void print() {
        System.out.println("Derived print()");
    }

    public void show() {
        System.out.println("Derived show()");
    }
}

public class test5 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.display();
        // obj.show();
        // obj.print(); Not allowed as print() is private in Base although it is public
        // in Derived
    }

}
