public class floyedTringlePattern {
    public static void main(String [] args){
        int n=5;
        int p =1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
    
}
