import java.util.*;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week's number( Eg- For Sunday,1, Monday,2..., Saturday,7): ");
        int wk= sc.nextInt();

        switch(wk) {
            case 1:
            System.out.println("Today is Sunday");
            break;

            case 2:
                System.out.println("Today is Monday");
                break;

            case 3:
                System.out.println("Today is Tuesday");
                break;

            case 4:
                System.out.println("Today is Wednesday");
                break;

            case 5:
                System.out.println("Today is Thursday");
                break;

            case 6:
                System.out.println("Today is Friday");
                break;

            case 7:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
