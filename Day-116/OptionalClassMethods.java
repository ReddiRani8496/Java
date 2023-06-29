import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalClassMethods {
    public static void main(String[] args) {

        int min2 = IntStream.of(1,2,3,4,5).min().orElse(0);
        System.out.println(min2);

        OptionalInt min = IntStream.of(1,2,3,4,5).min();
        System.out.println(min.getAsInt());

        OptionalDouble avg = DoubleStream.of(1,2,3,4,5).average();
        System.out.println(avg.getAsDouble());

        OptionalLong max = LongStream.of(1,2,3,4).max();
        System.out.println(max.getAsLong());

        OptionalLong max1 = LongStream.of().max();
        if(max1.isPresent())
            System.out.println(max1.getAsLong());
        else
            System.out.println("value is not present");

        List<Integer> listMan = List.of(1,2,3,4,5);
        Optional<Integer> listMin = listMan.stream().min(Comparator.naturalOrder());
        listMin.stream().forEach(System.out::println);

    }
}
