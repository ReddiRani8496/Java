import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

    public static void main(String[] args) {

        UnaryOperator<String> res = str -> str.toUpperCase(); // converting the string to upper case

        System.out.println(res.apply("Duck"));

        UnaryOperator<Integer> val = n->n; // takes a single argument and returns the argument

        System.out.println(val.apply(10));

        UnaryOperator<Double> temp = n->n;

        System.out.println(temp.apply(32.5));

        UnaryOperator<Character> c = d->d;

        System.out.println(c.apply('a'));

    }
}
