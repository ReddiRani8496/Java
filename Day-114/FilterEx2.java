// java program to print even numbers using filter() method

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterEx2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.stream();

        Stream<Integer> list1 = stream.filter(n -> n%2==0);

        list1.forEach(System.out::println);

    }
}
