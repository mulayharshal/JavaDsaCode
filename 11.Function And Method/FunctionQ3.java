import java.util.*;
// Write a Java program tocheckif a number is a palindrome in Java?
class FunctionQ3 {

    public static int reverse(int n){
        int rev =0;
        while (n>0){
            int lastno =n%10;
            rev = (rev*10)+lastno;
            n /=10;
        }
        return rev;
    }

    public static int palindrome(int n){
        int check =reverse(n);
        int x=2;
        if(n==check){
            System.out.println("Given number is palindrome");
        }else{
            System.out.println("Given number is not palindrome");
        }
        return x;
    }

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        palindrome(n);
    }
    
}
