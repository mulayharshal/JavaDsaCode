import java.util.*;
public class FunPrimeInRange {
    public static boolean primenum(int n){

        boolean result =false;
        if (n==1){
            result=true;
            return result;
        }

        if (n==2){
            result=false;
            return result;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                result=false;
                return result;
            }else{
                result=true;
            }
        }
        return  result;

    }

    public static void primerange(int n){
       // boolean result =primenum(n);
        for (int i=1;i<=n;i++){
            boolean result =primenum(i);
            if(result==true){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        primerange(n);
    }
    
}
