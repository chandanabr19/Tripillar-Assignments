class LifeCycleThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread state inside run: " + Thread.currentThread().getState());
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        LifeCycleThread t = new LifeCycleThread();

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start: " + t.getState());

        Thread.sleep(100);
        System.out.println("State during execution: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}