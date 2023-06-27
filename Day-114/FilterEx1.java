import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterEx1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.stream();

        Predicate<Integer> predicate = n -> n%2==0; // stores the even elements

        Stream<Integer> list1 = stream.filter(predicate); // filtering the predicate data

        list1.forEach(System.out::println);
    }
}
