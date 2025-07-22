public class PrintIncresingOrder {
    public static void main (String [] args){
        int n=10;
        incOrder(n);
    }
    static void incOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incOrder(n-1);
        System.out.print(n+" ");
    }
    
}
