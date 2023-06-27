import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(24,35,43,28,54,64);

        Stream<Integer> stream = list.stream();

        stream.map(n->n*n).forEach(System.out::println); // returns the square of elements in stream

    }
}
