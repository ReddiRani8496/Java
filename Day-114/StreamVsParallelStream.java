import java.util.Arrays;
import java.util.List;

public class StreamVsParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);

        long startTime = System.currentTimeMillis();

        list.stream().forEach(System.out::println);

        long endTime = System.currentTimeMillis();

        System.out.println("Stream Time: " + (endTime - startTime) + "ms");

        long startTime1 = System.currentTimeMillis();

        list.parallelStream().forEach(System.out::println);

        long endTime1 = System.currentTimeMillis();

        System.out.println("Parallel Stream Time: " + (endTime1 - startTime1) + "ms");
    }
}
