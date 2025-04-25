public class test8 {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread A: Waiting for 1s...");
                long start = System.currentTimeMillis();
                try {
                    lock.wait(1000);
                    long end = System.currentTimeMillis();
                    System.out.println("Thread A: Woke up after " + (end - start) + "ms");
                } catch (InterruptedException e) {
                    System.out.println("Thread A: Interrupted!");
                }
                System.out.println("Thread A: Got the lock back, continuing...");
            }
        });

        Thread threadB = new Thread(() -> {
            try {

                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                System.out.println("Thread B: Got the lock, holding it for 3 seconds...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread B: Releasing lock.");
            }
        });
        threadA.start();
        threadB.start();
    }
}
