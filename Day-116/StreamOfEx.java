import java.util.stream.Stream;

public class StreamOfEx {
    public static void main(String[] args) {

        Integer data[] = {6,3,4,2,9};
        Stream<Integer> s = Stream.of(data);
        s.forEach(System.out::println);

        Long data1[] = {43535l,234534l,335443l,44565l};
        Stream<Long> l = Stream.of(data1);
        l.forEach(System.out::println);

        Float data2[] = {43.34f,435.34f,89.83f};
        Stream<Float> f = Stream.of(data2);
        f.forEach(System.out::println);

    }
}
