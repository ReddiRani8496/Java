import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorEx {

    public static void main(String[] args) {

        DoubleBinaryOperator d = (d1,d2)->d1+d2;

        System.out.println(d.applyAsDouble(10.5,12.4));

    }
}
