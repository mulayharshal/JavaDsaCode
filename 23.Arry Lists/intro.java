import java.util.ArrayList;
public class intro{
    public static void main (String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();


        list.add(1);//O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get operation- O(1)
       int element= list.get(2);
       System.out.println(element);

       //remove
       list.remove(2);
       System.out.println(list);

       //set
       list.set(2,10);
       System.out.println(list);

       //contains
       System.out.println(list.contains(1));
       System.out.println(list.contains(11));

       //size
       System.out.println(list.size());
       for(int i=0; i<list.size();i++){
        System.out.print(list.get(i)+" ");
       }
       System.out.println();
    }
}