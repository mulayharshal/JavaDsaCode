import java.util.*;
// Write a program that reads a set of integers,and then print the sum of the even and odd integers.
public class LoopQ2 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        int choice;
        int evensum=0;
        int oddsum=0;
        do{
            System.out.println("Enter the number");
            int num =sc.nextInt();
            if(num%2==0){
                evensum+=num;
            }else{
                oddsum+=num;
            }
            System.out.println("if you want to continue enter 1 otherwise enter 0");
            choice = sc.nextInt();
        } while( choice == 1);

        System.out.println("Even sum is :" +evensum);
        System.out.println("Odd sum is :"+oddsum);

    }
    
}
