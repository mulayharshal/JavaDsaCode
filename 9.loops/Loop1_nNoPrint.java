import java.util.*;
public class Loop1_nNoPrint {
    //print the number 1 to n , n is the give from the user
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no upto you want print");
        int n= sc.nextInt();
        int count =1;
        
        while (count<=n){
            System.out.println(count);
            count++;
        }

    } 
    
}
