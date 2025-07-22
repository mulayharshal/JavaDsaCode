public class clearLastIthBit {
    public static  void main(String [] args){
        int n=15;
        int i=2;
        int bitmask=~0 <<i;
        System.out.println(n & bitmask);
    }
}
