import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsUnmodifiable {

    public static void main(String[] args) {

        List<Integer> list = Stream.of(1,2,3,4,5).collect(Collectors.toUnmodifiableList());

        list.add(8); // we can't modify the list values

        System.out.println(list);

    }
}
