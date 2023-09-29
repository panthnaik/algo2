import java.util.HashMap;

public class frequence_of_char {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String name="sudeep n naik";
        char charry[]=name.toCharArray();

        for (char c : charry) {
            if(map.containsKey(c)){ 
                int value=map.get(c);
                map.put(c, ++value);
                
            }
            else{
                map.put(c, 1);
            } 
        }
        System.out.println(map);
    }
    
}
