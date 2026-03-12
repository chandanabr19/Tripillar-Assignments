public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 2;

        while (i <= 100) {
            sum += i;
            i += 2; 
        }

        System.out.println("Sum of even numbers between 1 and 100 is: " + sum);
    }
}