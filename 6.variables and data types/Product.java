import java.util.*;

//Product of two number
public class Product {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first no ");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int prouduct = a*b;
        System.out.println("The product of "+a+" and "+b+" is : "+prouduct);

    }
    
}
