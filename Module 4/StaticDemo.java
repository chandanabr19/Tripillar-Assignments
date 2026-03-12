class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticDemo a = new StaticDemo();
        StaticDemo b = new StaticDemo();
        StaticDemo c = new StaticDemo();
        StaticDemo.showCount();
    }
}