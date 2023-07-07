import java.util.function.BinaryOperator;

public class BinaryOperatorEx {

    public static void main(String[] args) {

        BinaryOperator<Double> sum = (x1,x2)->(x1+x2); // takes two arguments and returns the specified type

        System.out.println(sum.apply(10.5,20.5));

        BinaryOperator<String> str = (s1,s2)->(s1+s2);

        System.out.println(str.apply("hi"," hello"));

        BinaryOperator<Integer> mul = (n1,n2) -> (n1*n2);

        System.out.println(mul.apply(10,20));

        BinaryOperator<Character> ascii = (a,b)-> (char) (a+b);

        System.out.println(ascii.apply('a','b'));


    }
}
