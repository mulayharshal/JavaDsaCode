import java.util.Stack;


public class DuplicateParatheses {
    public static void checkDuplicateParatheses(String str,Stack<Character> s,int i){
        if(i==str.length()){
            System.out.println("valid");
            return;
        }
        Character curr=str.charAt(i);
        if(s.isEmpty() || curr!=')'){
            s.push(curr);
        }else{
            int count=0;
            while(s.peek()!='('){
                s.pop();
                count++;
            }
            if(count==0){
                System.out.println("invalid");
                return;
            }else{
                s.pop();
                
            }
        }
        checkDuplicateParatheses(str, s, i+1);
    }
    public static void main(String []a){
        String str="((a+b))";
        System.out.println(str);
        Stack<Character> s=new Stack<>();
        checkDuplicateParatheses(str, s, 0);
    }
    
}
