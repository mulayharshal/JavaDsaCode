import java.util.ArrayList;

public class PairSum1 {
    //buret force
    public static void pairSum11(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(target==list.get(i)+list.get(j)){
                    System.out.println("the index "+i+" & "+j+" values is "+list.get(i)+" + "+list.get(j)+"= "+target);
                    return;
                }
            }
        }
        System.out.println("pair is not avaliable");
    }
    public static void main(String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        pairSum11(list,target);
        System.out.println(pairSum12(list, target));
    }

    //two pointer
    public static boolean pairSum12(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp) {
            //case 1
            int sum=list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }
            //case2
            if(sum<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;

    }


    
}
