public class solidRhombus {
    public static void main(String [] arsg){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=n;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
