import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        //creatibg hashmap
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        map.put("MAths",100);
        map.put("Science",98);
        // map.put("Science",100);

        System.out.println(map);

        //container
        System.out.println(map.containsKey("Science"));

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
    
}
