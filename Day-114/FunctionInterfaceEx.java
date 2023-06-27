/*
the Function interface is a functional interface from the java.util.function package.
It represents a function that takes in one argument of type T and produces a result of type R.
It can be used with lambda expressions or method references.
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionInterfaceEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.stream();
        Function<Integer,Integer> function = new Function<Integer, Integer>() { //Function class implementing using anonymous class
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
        Stream<Integer> integerStream = stream.map(function);
        integerStream.forEach(System.out::println);
    }
}
