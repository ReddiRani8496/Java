import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsEx1 {

    public static void main(String[] args) {

        List<String> list1 = List.of("sun","rises","in","the","east");

        List<String> list2 = List.of("rock","the","world");

        String result = list1.stream().collect(Collectors.joining(" ","<<<",">>>"));

        Map<String,Integer> map = list1.stream().collect(Collectors.toMap(v1->v1,v2->v2.length())); // returns the length of each word in the list

        System.out.println(map);

    }
}
