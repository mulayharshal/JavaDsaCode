import java.util.*;
//input week number(1-7) and print day of week name using switch case
public class conditionalQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number:");
        int num = sc.nextInt();

        switch(num){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            default : System.out.println("Invalid Day Number");
        }

    }
}