import java.util.Stack;

public class PushAtBottomInStack {

    public static void pushBottom(int data, Stack<Integer> s){
        //base
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        //recur
        int top=s.pop();
        Stack<Integer> newS=s;
        pushBottom(data, newS);
        s.push(top); 
    }
    public static void main(String []ar){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushBottom(7, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

    
}
