class MyResource implements AutoCloseable {
    private int id;
    private static int count;

    static {
        count = 1;
    }

    public MyResource() {
        id = count++;
        System.out.println("Creating MyResource " + id);
    }

    public void close() {
        System.out.println("Closing MyResource " + id);
    }
}

public class test12 {

    public static void main(String[] args) {
        try (MyResource r = new MyResource();
                MyResource r2 = new MyResource();
                MyResource r3 = new MyResource()) {
            System.out.println("Doing something");
        }
    }

}
