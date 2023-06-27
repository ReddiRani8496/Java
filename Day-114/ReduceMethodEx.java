import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// program to calculate maximum element in the list using reduce() method
public class ReduceMethodEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        int max = list.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println("Max: " + max);
    }
}
