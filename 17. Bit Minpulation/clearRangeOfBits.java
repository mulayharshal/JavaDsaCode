public class clearRangeOfBits {
    public static void main (String [] args){
        int n=2515;
        int i=2;
        int j=7 ;
        int ibitmask=~(~(0)<<(i));
        int jbitmask=~(0)<<(j+1);
        int bitmask=jbitmask | ibitmask;
        System.out.println(n & bitmask);
    }
}
