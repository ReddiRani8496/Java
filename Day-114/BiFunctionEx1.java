import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionEx1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,6,7,8,9);

        BiFunction<Integer,Integer,Integer> biFunction = (n1,n2) -> n1+n2;

        Integer res = biFunction.apply(20,30);

        System.out.println(res);
    }
}
