import java.util.Stack;


public class ReverseStringInStack {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        StringBuilder result=new StringBuilder();
        while(!s.isEmpty()){
            result.append(s.pop());
        }

        return result.toString();
    }
    public static void main(String [] a){
        String str="abc";
        System.out.println(str);
        String neSt=reverseString(str);
        System.out.println(neSt);
        

    }
    
}
