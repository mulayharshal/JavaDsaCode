import java.util.*;
//takes a year from the user and print whether that year is a leap year or not
public class conditionalQ5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year =sc.nextInt();

        
        if ( year%4==0) {
        System.out.println(year + " is a leap year");
        } else {
        System.out.println(year + " is not a leap year");
        }

    }
    
}
