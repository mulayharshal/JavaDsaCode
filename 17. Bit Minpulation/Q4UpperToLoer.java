public class Q4UpperToLoer {

    public static void main(String[] args) {
        char s='D';
        int bitmase=1<<5;
        if((s & bitmase)==0){
            System.out.println("0");
            System.out.println((char)(s | bitmase));
        }else{
            System.out.println("1");
            System.out.println((char) (s & ~bitmase));
        }
    }
}