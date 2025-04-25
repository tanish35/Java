class Printer {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Even: " + number);
                number++;
                notifyAll();
            }
        }

    }

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Odd: " + number);
                number++;
                notifyAll();
            }
        }

    }
}

class EvenThread extends Thread {
    private final Printer printer;

    public EvenThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printEven();
    }
}

class OddThread extends Thread {
    private final Printer printer;

    public OddThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printOdd();
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread even = new EvenThread(printer);
        Thread odd = new OddThread(printer);

        even.start();
        odd.start();

        try {
            even.join();
            odd.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Done printing.");
    }
}
