import java.util.ArrayList;

public class SwapNo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        swap(list, 1, 3);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer> list, int idx1, int idex2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idex2));
        list.set(idex2, temp);
    }
}
