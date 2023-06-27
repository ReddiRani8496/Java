// java program to filter the numbers greater than 5

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterEx3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.stream();

        Stream<Integer> list1 = stream.filter(n -> n>5);

        list1.forEach(System.out::println);
    }
}
