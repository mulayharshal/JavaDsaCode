import java.util.Stack;

public class VaildParentheses {
    public static void checkVlaidParenthese(String str,int i,Stack<Character> s){
        if(i==str.length()){
            if(s.isEmpty()){
                System.out.println("valid");
                return ;
            }else{
                System.out.println("Invalid");
                return ;
            }
        }
        Character curr=str.charAt(i);
        if(!s.isEmpty()){
            Character Top=s.peek();
            if (Top=='(' && curr==')' ){
                s.pop();
            }else if (Top=='{' && curr=='}' ){
                s.pop();
            }else if(Top=='[' && curr==']' ){
                s.pop();
            }else{
                s.push(curr);
            }
        }else{
            s.push(curr);
        }
        
        checkVlaidParenthese(str, i+1, s);

    }
    public static void main(String [] args){
        String str="({[]}())";
        System.out.println(str);
        Stack<Character> s=new Stack<>();
        checkVlaidParenthese(str, 0, s);
    }
}
