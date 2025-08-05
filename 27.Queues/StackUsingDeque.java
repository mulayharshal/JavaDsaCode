import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {

    static class Stack{
       static Deque<Integer> q;
        Stack(){
            this.q= new LinkedList<>();
        }

        public void push(int data){
            q.addFirst(data);
        }
        public boolean isEmpty(){
            return q.isEmpty();
        }
        public int pop(){
            if(q.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q.removeFirst();
        }
        public int peek(){
            return q.getFirst();
        }
    }
    public static void main(String []a){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
