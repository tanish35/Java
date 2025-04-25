public class test17 {
    public static void main(String[] args) {
        // 1. Named Thread with Runnable Implementation
        MyRunnable myRunnable = new MyRunnable("Thread-1");
        Thread namedThread = new Thread(myRunnable);
        namedThread.start();

        // 2. Anonymous Thread with Runnable Implementation
        Thread anonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Thread: " + Thread.currentThread().getName() + " is running.");
            }
        });
        anonymousThread.start();

        // 3. Lambda Expression for Anonymous Thread
        Thread lambdaThread = new Thread(() -> {
            System.out.println("Lambda Thread: " + Thread.currentThread().getName() + " is running.");
        });
        lambdaThread.start();

        // 4. Multiple Threads with Anonymous Objects
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Anonymous Thread " + Thread.currentThread().getName() + " is running.");
                }
            }).start();
        }

        Thread thread1 = new Thread(new MyRunnable("Thread-1"));

        // 5. Named Thread with Lambda Expression
        Thread namedLambdaThread = new Thread(() -> {
            System.out.println("Named Lambda Thread: " + Thread.currentThread().getName() + " is running.");
        }, "Named-Lambda-Thread");
        namedLambdaThread.start();
    }
}

class MyRunnable implements Runnable {
    private final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Named Thread: " + name + " is running.");
    }
}
