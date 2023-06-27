import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionInterfaceEx1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.stream();

        Function<Integer,Integer> function = n -> n*2; // Function class implementing using lambda expression

        Stream<Integer> integerStream = stream.map(function);

        integerStream.forEach(System.out::println);
    }
}
