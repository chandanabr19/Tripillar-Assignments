class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " Count: " + count);
    }
}

class CounterThread extends Thread {
    Counter counter;

    CounterThread(Counter counter, String name) {
        super(name);
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        CounterThread t1 = new CounterThread(counter, "Thread-1");
        CounterThread t2 = new CounterThread(counter, "Thread-2");

        t1.start();
        t2.start();
    }
}