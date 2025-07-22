public class TillingProblem {
    public static void main(String [] args){
        System.out.println(tiProblem(4));

    }
    public static int tiProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1= tiProblem(n-1);
        int fnm2= tiProblem(n-2);
        return fnm1+fnm2;
    }
    
}
