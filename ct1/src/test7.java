class Outer {
    private int a = 10;

    void fun() {
        System.out.println("outer fun");
    }

    class Inner extends Outer {
        public void fun() {
            System.out.println("inner fun " + a);
            // Outer.super.fun();
        }
    }
}

public class test7 {
    public static void main(String args[]) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.fun();
        o.fun();
        o = i;
        o.fun();
    }
}