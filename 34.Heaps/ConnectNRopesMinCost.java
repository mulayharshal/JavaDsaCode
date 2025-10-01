import java.util.PriorityQueue;

public class ConnectNRopesMinCost  {
      
    public static void main(String []a){
        int ropes[]={2,3,3,4,6};

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for( int i=0; i<ropes.length;i++ ){
            pq.add(ropes[i]);
        }
       
        int cost=0;
        while(pq.size()>1){
            int n1=pq.remove();
            int n2=pq.remove();
            cost+=n1+n2;
            pq.add(n1+n2);
        }
        System.out.println(cost);
       
    }
}
