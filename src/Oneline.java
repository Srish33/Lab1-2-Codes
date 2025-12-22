import java.util.*;

public class Oneline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        System.out.println("Enter Second Name: ");
        String secondName = sc.next();

        System.out.printf("Your name Reversed: %s %s", secondName, firstName);
    }

}
