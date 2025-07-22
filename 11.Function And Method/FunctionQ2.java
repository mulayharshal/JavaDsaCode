import java.util.*;
// Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
public class FunctionQ2 {
    
    public static boolean isEven(int n){
        boolean result;
        if(n%2==0){
            result=true;
        }else{
            result=false;
        }
        return result;
    }

    public static void main(String[] argas){
        Scanner hc =new Scanner (System.in);
        System.out.println("Enter the number you want to check even or not");
        int n= hc.nextInt();
        System.out.println(isEven(n));
    }
}
