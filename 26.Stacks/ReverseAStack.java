import java.util.Stack;


public class ReverseAStack{
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        PushAtBottomInStack.pushBottom(top, s);

    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String []a){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //4,3,2,1

        reverseStack(s);
        //1,2,3,4

        printStack(s);
    }
}