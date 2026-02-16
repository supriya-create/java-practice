import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 20.5);
        map.put("orange", 15.5);
        map.put("mango", 30.5);
        map.put("banana", 10.5);

        map.remove("apple");
        System.out.println(map.get("mango"));
        System.out.println(map.containsKey("pineapple"));
        System.out.println(map.containsValue(15.5));
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key+ " ₹" + map.get(key));
        }
    }
}
