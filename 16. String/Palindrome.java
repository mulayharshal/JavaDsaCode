public class Palindrome {
    public static boolean check(String name){
        int mid=name.length();
        for(int i=0;i<mid;i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                return false;
            }
        }
        return true;

    }
    public static void main(String [] args){
        String name="racecar";
        System.out.println(check(name));
    }
    
}
