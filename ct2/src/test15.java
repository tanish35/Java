
public class test15 {
    class Demo {
        public <T> void method(T t) {
            System.out.println("Generic method called with: " + t);
        }
    }

    public static void main(String[] args) {
        test15 obj = new test15();
        Demo demo = obj.new Demo();
        demo.method("Hello, World!");
        demo.method(123);
        demo.method(45.67);
    }

}
