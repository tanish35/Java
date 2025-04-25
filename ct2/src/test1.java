class Series {
    public float sum = 0;
    private int count = 0;
    private int denom = 1;
    private int fac = 1;
    private int MAX = 10;

    public synchronized void denom() {
        while (count < MAX) {
            while (denom != -1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            fac *= (count + 1);
            denom = fac;
            count++;
            notifyAll();
        }
    }

    public synchronized void sum() {
        while (count < MAX) {
            while (denom == -1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Sum: " + sum + " Denom: " + denom);
            sum += 1.0 / denom;
            denom = -1;
            notifyAll();
        }
    }

}

class DenomThread extends Thread {
    private Series series;

    public DenomThread(Series series) {
        this.series = series;
    }

    @Override
    public void run() {
        series.denom();
    }
}

class SumThread extends Thread {
    private Series series;

    public SumThread(Series series) {
        this.series = series;
    }

    @Override
    public void run() {
        series.sum();
    }
}

public class test1 {
    public static void main(String[] args) {

        Series series = new Series();
        DenomThread denomThread = new DenomThread(series);
        SumThread sumThread = new SumThread(series);

        denomThread.start();
        sumThread.start();

        try {
            denomThread.join();
            sumThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final sum: " + series.sum);
        // System.out.println("Final denom: " + series.denom);

        Series series2 = new Series();

        Thread thread1 = new Thread(() -> {
            series2.denom();
        });
        Thread thread2 = new Thread(() -> {
            series2.sum();
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final sum: " + series2.sum);

    }

}
