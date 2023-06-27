import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapEx1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.stream();
//
//        long count = stream
//                     .map(n -> n*n*n)
//                     .count();
//
//        System.out.println(count); // returns the number of elements in the list

        List list1 = stream.map(n -> n*n).collect(Collectors.toList()); // collecting data as list

        System.out.println(list1);
    }
}
