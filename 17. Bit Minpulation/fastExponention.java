public class fastExponention {
    public static void main(String[] args) {
        int a=5;
        int n=4;
        int ans=1;
        while(n>0){
            if ((n &1)!=0){  //lsb
                ans=ans*a; 
            }
            a= a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    
}
