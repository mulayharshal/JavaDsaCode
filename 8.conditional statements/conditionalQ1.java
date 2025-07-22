import java.util.*;
//Java program to get a number from the user and print whether it is positive or negative
public class conditionalQ1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        double n = sc.nextDouble();

        if (n<0){
            System.out.println(n+" is the NEGATIVE");
        }else{
            System.out.println(n+ "is the POSITIVE");
        }

    }
}