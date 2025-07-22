public class updateithBit {
    public static void main(String [] args){
        int n=10;
        int i=1;
        int bitmask=1<<i;
        int ithbit;
        if((n & bitmask)==0){
            ithbit=0;
            System.out.println("ith bit is ="+ithbit);
            System.out.println(n | bitmask);

        }else{
            ithbit=1;
            System.out.println("ith bit is ="+ithbit);
            System.out.println(n & ~bitmask);
        }
    }
}
