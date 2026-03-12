import java.io.FileReader;
import java.io.IOException;

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }
    }
}