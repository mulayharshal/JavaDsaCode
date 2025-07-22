import java.util.*;
//Write a Java method to compute the sum of the digits in an integer.
public class FUnctionQ5 {

    public static int sumdigit(int n ){
        int sum =0;
        for (int i=1;i<=n;i++){
            sum= sum+i;

        }
        return sum;
    }

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();
        System.out.println(sumdigit(n));
    }
    
}
