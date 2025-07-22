import java.util.*;
// Write a program to print  the multiplication table of a number N , entered by the user.
public class LoopQ4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
    
}
