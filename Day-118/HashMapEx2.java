import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx2 {
    public static void main(String[] args) {

        List<String> list = List.of("Change","the","palnet");

        List<String> list1 = List.of("Focus","React","Consistenccy");

        Map<Integer,List<String>> map = new HashMap<>();

        map.put(1,list);

        map.put(2,list1);

        map.put(3,list); // duplicates are not allowed in HashMap

        System.out.println(map);
    }
}
