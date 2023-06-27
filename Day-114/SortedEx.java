import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.stream();

        Stream<Integer> list1 = stream.map(n->n*n).filter(n->n%2==0).sorted(); // squaring the elements, filtering even numbers and sorting the data

        list1.forEach(System.out::println);
    }
}
