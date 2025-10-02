import java.util.*;
public class LinkedHashMapCode {
    public static void main(String []a){
        LinkedHashMap<String ,Integer> lhm=new LinkedHashMap<>();
        lhm.put("india", 150);
        lhm.put("China", 150);
        lhm.put("us", 50);

        System.out.println(lhm);
    }
}
