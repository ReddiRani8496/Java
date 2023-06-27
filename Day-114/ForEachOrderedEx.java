/*
 to process the elements in a specific order, we use the forEachOrdered method.
  This method guarantees that the elements will be processed in the order specified.
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachOrderedEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Stream<Integer> stream = list.parallelStream(); // it stores the elements randomly

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("items "+integer);
            }
        };

        stream.forEachOrdered(consumer);
    }
}
