import java.util.*;
// Write a Java method to compute the average of three numbers.
public class FunctionQ1 {
    public static int avrage (int n1,int n2,int n3){
        int average=(n1+n2+n3)/3;
        System.out.println("The average of the given three numbers is : "+average);
        return average;

    }

    public static void main(String [] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the three numbers");
        int n1=sc.nextInt();
        int n2 =sc.nextInt();
        int n3=sc.nextInt();
        avrage(n1, n2, n3);
    }
    
}
