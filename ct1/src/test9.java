interface IN1 {
    void f1();
}

interface IN2 {
    void f2();
}

interface IN3 extends IN1, IN2 {
    void f3();
}

class Sample implements IN3 {
    public void f1() {
        System.out.println("f1");
    }

    public void f2() {
        System.out.println("f2");
    }

    public void f3() {
        System.out.println("f3");
    }
}

public class test9 {

}
