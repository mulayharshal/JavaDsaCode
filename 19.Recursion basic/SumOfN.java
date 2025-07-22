public class SumOfN {
    public static void main (String [] args){
        int n=5;
        System.out.println(sumUtoN(n));

    }
    static int sumUtoN(int n){
        if(n==1){
            return n;
        }
        return(sumUtoN(n-1)+n);
    }
    
}
