import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    public static void main(String[] args) {

        Map<Integer,Integer> hashMap = new HashMap<>();

        hashMap.put(3,7);

        hashMap.put(4,7);

        System.out.println(hashMap.containsKey(5)); // Time complexity O(1)

        System.out.println(hashMap.containsValue(7)); // Time complexity O(n)

        System.out.println(hashMap.get(4)); // Time complexity O(1)

    }

}
