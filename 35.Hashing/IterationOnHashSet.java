import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSet {
    public static void main(String []a){
        HashSet<String> cites= new HashSet<>();
        cites.add("Delhi");
        cites.add("Mumbai");
        cites.add("Noida");
        cites.add("Bengaluru");
        
        Iterator it =cites.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------");


        for(String s:cites){
            System.out.println(s);
        }
    }
}
