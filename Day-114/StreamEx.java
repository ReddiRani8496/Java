import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);

      //  stream.forEach(System.out::println); // only one time the data can be accessed from Stream,
                                               // after accessing data the file is closed
    }
}
