import java.util.HashSet;

public class HashSetCode {
    public static void main (String []a){
        HashSet<Integer> set= new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
        System.out.println(set.size());

        System.out.println(set.contains(2));
        System.out.println(set.contains(3));

        set.remove(2);
        System.out.println(set.contains(2));

        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        

    }
    
}
