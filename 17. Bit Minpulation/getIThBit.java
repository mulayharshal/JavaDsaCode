public class getIThBit {
    public static void main(String[] args) {
        int n=10;
        int i=1  ;
        int bitmask =1<<i;
        if((n & bitmask )==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
    
}
