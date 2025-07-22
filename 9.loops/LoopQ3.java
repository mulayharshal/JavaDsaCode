import java.util.*;
public class LoopQ3 {
    public static void main(String [] args){
        //Write a program to find the factorial of any number entered by the user.
        Scanner sc = new Scanner(System.in);
       
    
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial *=i;
        }
        System.out.println("The factorial of "+n+" is : "+factorial);

    }
    
}
