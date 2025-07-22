public class powerOf2 {
    public static void main (String [] aStrings){
        int n=12;
       
        if ((n & (n-1))==0) {
            System.out.println(n +" is power of 2");
        }else{
            System.out.println(n +" is NOT power of 2");
        }
    }
}
