import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    
    public static void main(String []a){
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("indonesia", 6);
        hm.put("nepal", 5);

        // Interate
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        
        for (String key : keys) {
            System.out.println("key = "+key+", value = "+hm.get(key));
        }
    } 
}
