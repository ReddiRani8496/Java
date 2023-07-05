import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {
    public static void main(String[] args) {
       List<String> list1 = new ArrayList<>(List.of("milk","is","white"));
       Map<Integer,List<String>> map1 = list1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map1);
        Map<Boolean,List<String>> map2 = list1.stream().collect(Collectors.partitioningBy(str->str.contains("i")));
        System.out.println(map2);
        Map<Boolean,List<String>> map3 = list1.stream().collect(Collectors.partitioningBy(str->str.endsWith("e")));
        System.out.println(map3);
    }
}
