import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionEx {
    public static void main(String[] args) {
        Function<Integer,String> function = n->"rock"; // takes single argument and returns the specified return type

        String str = function.apply(5);

        System.out.println(str);

        BiFunction<String,String,Double> b = (n1,n2) -> Double.parseDouble(n1) + Double.parseDouble(n2); // takes two arguments and return the specified return type

        Double sum = b.apply("10.5","2.4");

        System.out.println(sum);
    }
}
