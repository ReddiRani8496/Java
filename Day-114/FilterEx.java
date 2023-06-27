/*
The filter method in the Java Stream API is used to select elements from a stream based on a specified condition.
It takes a predicate as a parameter, which is a functional interface that defines the condition for filtering.
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.stream();
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };
        Stream<Integer> list1 = stream.filter(predicate);
        list1.forEach(System.out::println);
    }
}
