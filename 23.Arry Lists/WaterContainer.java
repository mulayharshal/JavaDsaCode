import java.util.ArrayList;

public class WaterContainer {
    public static  void main(String [] args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int idx1=0;
        int idx2=0;
        int water=0;
        for(int i=0;i<height.size()-1;i++){
            for(int j=i+1;j<height.size();j++){
                int base=j-i;
                int hig=Math.min(height.get(i), height.get(j));
                int newwater=base*hig;
                if(newwater>water){
                    water=newwater;
                    idx1=height.get(i);
                    idx2=height.get(j);
                }
            }
        }
        System.out.println("the maximum water stoerd in container is "+water+" their hegiths is "+idx1+ " and "+idx2);
    }
    
}
