//to try static variables and methods

class Sample {
    static int s = 10;
    int count = 3;

    {
        System.out.println("init block");
        System.out.println(count);
        System.out.println(s);
    }
    static {
        System.out.println("static block");
    }

    Sample() {
        count = s++;
    }

    {
        System.out.println("init block 2");
    }

    int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public String toString() {
        return "s = " + s + " count = " + count;
    }
}

public class test4 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        // System.out.println(s1);
        Sample s2 = new Sample();
        Sample s3 = new Sample();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
