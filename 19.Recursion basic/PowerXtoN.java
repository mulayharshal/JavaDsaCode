public class PowerXtoN {
    public static void main (String [] args){
        int a=90;
        int n=5;
        System.out.println(optimizedPower(n,a));
    }
    public static int optimizedPower(int n, int a){
        if(a==1){
            return n;
        }
        int hlafPower=optimizedPower(n,(a/2));
        int hallfSquare=hlafPower*hlafPower;
        if(a%2==0){
            return hallfSquare;
        }else{
             return n*hallfSquare;
        }
        
    }
    
}
