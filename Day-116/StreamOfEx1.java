import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfEx1 {
    public static void main(String[] args) {

        IntStream intStream = IntStream.iterate(0,i->i+1).limit(5);
        intStream.forEach(System.out::println);
        Stream<Integer> myIntegerStream = Stream.of(1,2,4,5,6);
        DoubleStream doubleStream =DoubleStream.of(10,20,30,40,50);
        int[] data = new int[10000];

        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        Arrays.stream(data);

        IntStream intStreamRange = IntStream.range(1,15); // prints 1-14
        intStreamRange.forEach(System.out::println);

        IntStream intStreamRangeClose = IntStream.rangeClosed(1,15);// prints 1-15
        intStreamRangeClose.forEach(System.out::println);

        List<String> list = List.of("john","Nick","king");
        Stream<String> streamFromList = list.stream();

        System.out.println(IntStream.of(1,2,3,4,5).max());
        System.out.println(IntStream.of(1,2,3,4,5).min());
    }
}
