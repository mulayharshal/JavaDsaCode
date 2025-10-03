import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetCode {
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

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);
    }
}
