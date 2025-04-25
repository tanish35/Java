class Sample {
    int a, b;

    void get() {
        display(this);
    }

    void display(Sample obj) {
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    public String toString() {
        return (a + "\n" + b);
    }
}

public class test1 {
    public static void main(String[] args) {

        Sample obj = new Sample();
        obj.a = 10;
        obj.b = 20;
        System.out.println(obj);
    }
}