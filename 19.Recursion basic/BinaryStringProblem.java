public class BinaryStringProblem {
    public  static void main (String [] args){
        printBinString(3,0,"");
    }
    public static void printBinString(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
         printBinString( n-1, 0,str+"0");
        if(lastplace==0){
            printBinString( n-1, 1,str+"1");
        }
    }
    
}
