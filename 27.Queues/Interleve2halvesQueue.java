import java.util.LinkedList;
import java.util.Queue;

public class Interleve2halvesQueue {
    public static void interleveQueue(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>();
        int mid = q.size() / 2;

        for (int i = 0; i < mid; i++) {
            q2.add(q.remove());
        }
        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }
    }

    public static void printQueue(Queue<Integer> q) {
        Queue<Integer> qp = q;
        while (!qp.isEmpty()) {
            System.out.print(qp.peek()+" ");
            qp.remove();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

          
        interleveQueue(q);
        printQueue(q);

    }

}
