import java.util.function.IntToDoubleFunction;

public class IntDoubleFunctionEx {

    public static void main(String[] args) {

        IntToDoubleFunction itdf = n->n+5.6;

        System.out.println(itdf.applyAsDouble(10));

    }
}
