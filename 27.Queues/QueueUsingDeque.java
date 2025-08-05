import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue{
        Deque<Integer> dq;
        Queue(){
            this.dq=new LinkedList<>();
        }

        public boolean isEmpty(){
            return dq.isEmpty();
        }
        public void add(int data){
             dq.addLast(data);
        }
        public int remove(){
            if(dq.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return dq.removeFirst();
        }
        public int peek(){
            return dq.peek();
        }
    }
    public static void main(String [] a){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
