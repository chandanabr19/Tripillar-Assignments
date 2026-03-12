final class FinalClass {
    final int value = 10;

    final void display() {
        System.out.println("Final value: " + value);
    }
}

class Demo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}