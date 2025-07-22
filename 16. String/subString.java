public class subString {
    public static void substring(String str, int si , int ei){
        for(int i=si; i<=ei; i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main (String [] args){
        String str= "Harshal Mulay";
        substring(str, 3, 7);

        //inbuilt
        System.out.println(str.substring(0,6));
    }
}
