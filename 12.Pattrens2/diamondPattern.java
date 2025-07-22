public class diamondPattern {
    public static void main(String[]args){
        int n= 7;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=n-i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
