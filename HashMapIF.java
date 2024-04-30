import java.util.HashMap;
import java.util.Map;

public class SimpleHashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> obj = new HashMap<String,Integer>();

        obj.put("Bala", 20);
        obj.put("sai", 24);
        obj.put("Leela", 22);
        obj.put("Megha", 21);

        for(Map.Entry<String,Integer> m:obj.entrySet()){ 
            System.out.println(m.getKey()+" = "+m.getValue()); 
        }
    }
}
