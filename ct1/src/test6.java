public class test6 {
    public static void main(String[] args) {
        Base ob = new Child();
        ob.show();
    }
}

class Base {
    protected void show() {
        System.out.println("base:show");
    }
}

class Child extends Base {
}