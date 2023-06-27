//parallelStreams used to increase the performance of a program.
// it stores the elements randomly

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.parallelStream();

        stream.forEach(System.out::println);
    }
}
