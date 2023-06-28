/*
the first argument represents type of the  function
the second argument represents type of the function
the last argument represents the result of the function
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionEx {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        BiFunction<Integer,Integer,Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {

            @Override
            public Integer apply(Integer integer, Integer integer2) {

                return integer*integer2;

            }
        };

       Integer result = biFunction.apply(10,20);

        System.out.println(result);
    }
}
