class ResourceA {
}

class ResourceB {
}

class DeadlockThread1 extends Thread {
    ResourceA a;
    ResourceB b;

    DeadlockThread1(ResourceA a, ResourceB b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        synchronized (a) {
            System.out.println("Thread 1 locked Resource A");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            synchronized (b) {
                System.out.println("Thread 1 locked Resource B");
            }
        }
    }
}

class DeadlockThread2 extends Thread {
    ResourceA a;
    ResourceB b;

    DeadlockThread2(ResourceA a, ResourceB b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        synchronized (b) {
            System.out.println("Thread 2 locked Resource B");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            synchronized (a) {
                System.out.println("Thread 2 locked Resource A");
            }
        }
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();

        DeadlockThread1 t1 = new DeadlockThread1(a, b);
        DeadlockThread2 t2 = new DeadlockThread2(a, b);

        t1.start();
        t2.start();
    }
}