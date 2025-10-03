import java.util.HashMap;

public class FindLtineryFromTickets {

    public static String getStart(HashMap<String , String> tickets){
            HashMap<String , String> reMap= new HashMap<>();
            for(String key:tickets.keySet()){
                reMap.put(tickets.get(key), key);
            }
            for(String key:tickets.keySet()){
                if(!reMap.containsKey(key)) return key;
            }
            return null;
    }
    
    public static void main(String [] args){
        HashMap<String , String> tickets= new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Goa", "Chennai");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Delhi", "Goa");

        String start=getStart(tickets);
        System.err.print(start);
        while(tickets.containsKey(start)){
            start=tickets.get(start);
            System.err.print(" -> "+start);
        }
    }
}
