import java.util.*;

public class LinkedHashSetCode {

    public static void main(String a[]) {
        HashSet<String> cites = new HashSet<>();
        cites.add("Delhi");
        cites.add("Mumbai");
        cites.add("Noida");
        cites.add("Bengaluru");
        System.out.println(cites);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);
        
    }
}
