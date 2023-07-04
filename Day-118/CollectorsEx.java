import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx {

    public static void main(String[] args) {

        List<String> list = List.of("welcome","to","new","world");

        String res = list.stream().collect(Collectors.joining("*"));

        System.out.println(res);

        String res1 = list.stream().collect(Collectors.joining("",">>>","<<<"));

        System.out.println(res1);
    }
}
