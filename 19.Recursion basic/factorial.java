public class factorial {
    public static void main(String [] args){
        int n=5;
        System.out.println(calcFacto(n));
    }
    static int calcFacto(int n){
        if(n==0){
            return 1;
        }
        return n* calcFacto(n-1);

    }
    
}
