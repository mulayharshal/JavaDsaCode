import java.util.*;
//check the given no is prime or not
public class FunPrime {
    public static String primenum(int n){
        String result ="Not prime";
        if (n==1){
            result="prime";
            return result;
        }

        if (n==2){
            result="Not prime";
            return result;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                result="Not Prime";
                return result;
            }else{
                result="Prime";
            }
        }
        return  result;
    }

   
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr  the number");
        int  n = sc.nextInt();
        System.out.println(primenum(n));

    }
    
}
