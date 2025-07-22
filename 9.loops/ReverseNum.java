public class ReverseNum {
    public static void main (String []args){
        //print the reverse of the number

        int n = 87349;
        while(n>0){
            int lastdigit =n%10;
            System.out.print(lastdigit);
            n /=10;
        }
    }    
}
