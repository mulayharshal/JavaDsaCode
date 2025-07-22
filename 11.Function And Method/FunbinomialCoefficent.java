import java.util.*;
//calculate the binomial cofficent
public class FunbinomialCoefficent {
    public static int binomialCofficent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n =sc.nextInt();
        System.out.println("Enter the r");
        int r =sc.nextInt();
        
        int nf=1;
        int rf=1;
        int nr=n-r;
        int nrf=1;
        for (int i=1;i<=n;i++){
            nf=nf*i;
        }
        for (int j=1;j<=r;j++){
            rf=rf*j;
        }
        for (int k=1;k<=nr;k++){
            nrf=nrf*k;
        }
        double bino=nf/(rf*nrf);
        System.out.println("The binomial coefficent is : "+bino);
    return nrf ;
    }
    public static void main(String[] args){
        binomialCofficent();
        
    }
    
}
