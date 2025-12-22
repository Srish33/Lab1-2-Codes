import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks scored: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!!");
        }
        else if (marks < 100 && marks > 90) {
            System.out.println("You have got O grade.");
        }
        else if (marks < 90 && marks > 80) {
            System.out.println("You have got E grade.");
        }
        else if (marks < 80 && marks > 70) {
            System.out.println("You have got A grade.");
        }
        else if (marks < 70 && marks > 60) {
            System.out.println("You have got B grade.");
        }
        else {
            System.out.println("You have got C grade.");
        }
    }
}
