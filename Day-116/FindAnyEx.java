import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FindAnyEx {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list.stream().findAny());
        System.out.println(list.parallelStream().findAny());
        System.out.println(list.stream().findFirst());
        System.out.println(list.stream().anyMatch(e->e>10));
        System.out.println(list.stream().anyMatch(e->e>0));
        System.out.println(list.stream().anyMatch(e->e<0));

        double avg = DoubleStream.of(1,2,3,4,5).average().orElse(0);
        int max = IntStream.of(1,2,3,4).max().orElse(0);
        long min = LongStream.of(1,2,3,4).min().orElse(0);

        OptionalDouble avg2 =  DoubleStream.of(1,2,3,4,5).average();
        OptionalInt max2 = IntStream.of(1,2,3,4).max();
        OptionalLong min2 = LongStream.of(1,2,3,4).min();

        System.out.println(avg2.getAsDouble());
        System.out.println(avg2.isPresent());
        System.out.println(avg2.isEmpty());
    }
}
