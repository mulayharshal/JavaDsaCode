import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Row implements Comparable<Row>{
        int soldiers;
        int  idx;
        public Row(int soldiers,int idx){
            this.soldiers=soldiers;
            this.idx=idx;
        }
        @Override
        public int compareTo(Row r) {
           if(this.soldiers==r.soldiers){
            return this.idx-r.idx;
           }else{
            return this.soldiers-r.soldiers;
           }
        }
    }
    
    public static void main(String a[]){

        int army[][]={{1,0,0,0},
                    {1,1,1,1},
                    {1,0,0,0},
                    {1,0,0,0}};
        int k=2;

        PriorityQueue<Row> pq=new PriorityQueue<>();

        for(int i=0;i<army.length;i++){
            int soldiers=0;
            for(int j=0;j<army[i].length;j++){
                if(army[i][j]==1){
                    soldiers++;
                }
            }
            pq.add(new Row(soldiers, i));
        }

        for(int i=0; i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
