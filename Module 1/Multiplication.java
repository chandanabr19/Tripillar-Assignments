import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0–100): ");
        int marks = sc.nextInt();

        int gradeGroup = marks / 10;  // groups like 90–100, 80–89, etc.

        switch (gradeGroup) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                if (marks >= 0 && marks < 60) {
                    System.out.println("Grade: F");
                } else {
                    System.out.println("Invalid marks entered.");
                }
        }

        sc.close();
    }
}