public class ReverseGivenNum{
    public static void main(String [] args){

        int rev =0;
        int n= 583972;
        while (n>0){
            int lastno =n%10;
            rev = (rev*10)+lastno;
            n /=10;
        }
        System.out.println(rev);
    }
}