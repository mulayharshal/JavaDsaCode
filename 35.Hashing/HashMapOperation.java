import java.util.HashMap;

public class HashMapOperation{
    public static void main (String args[]){
        // Create
        HashMap<String , Integer> hm= new HashMap<>();

        // Insert
        hm.put("india", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);


        // Get 
        int population=hm.get("india");
        System.out.println(population);

        System.out.println(hm.get("nepal"));

        // ContainsKey 
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("nepal"));

        //remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}