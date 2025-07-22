public class Palindrome {
    public static void check(String str){
        int len=str.length();

        for(int i=0;i<(len/2);i++){

            if(str.charAt(i) != str.charAt(len-1-i)){
                System.out.println("no");
                return ;
            }
        }
        System.out.println("This string is palindrome");

    }
    public static void main(String [] args){
        String str="racecar";
        check(str);
    }
}
