import java.util.*;
//print the sum of n natural number
public class sumOfNNaturalNOWhile {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i= 1;
        int sum=0;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("The Sum of the "+n+" Natural no is : "+sum);
       
    }
    
}
