class ThreadClassExample extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class");
    }
}

class RunnableExample implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadClassExample t1 = new ThreadClassExample();
        t1.start();

        Thread t2 = new Thread(new RunnableExample());
        t2.start();
    }
}