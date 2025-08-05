import java.util.LinkedList;
public class LLinCollection {
    public static void main(String [] ar){
        //create
        LinkedList<Integer> list=new LinkedList<>();

        //add
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        
        
        System.out.println(list);

        //remove
        list.removeLast();
        list.removeFirst();
        System.out.println(list);

        System.out.println(list.size());

    }
    
}
