import java.util.*;
//ccheck the given no is prime or not
public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();//give the input from user 
        boolean numprime=true;//defult store number is prime
        for(int i=2; i<n;i++){
            if (n%i==0){
                numprime=false;//change when no is not prime
                break;
            }
        }

        //prinrt the result
        if(numprime==true){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not prime number");
        }
    }
    
}
