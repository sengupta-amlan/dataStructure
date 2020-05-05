import java.util.HashMap;
import java.util.Map;

public class HashingOfMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("vishal",10);
        map.put("sachin",30);
        map.put("vaibhav",20);
        System.out.println("Size of the map is "+ map.size());
        print(map);

        System.out.println(map.containsKey("vishal"));
        int a=map.get("vishal");
        System.out.println(a);
        map.clear();
        print(map);
    }

    public static void print(Map<String,Integer> map){
        if(map.isEmpty()){
            System.out.println("Map is empty");
        }
        else{
            System.out.println(map);
        }
    }
}
