import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {

        Predicate<Integer> integerPredicate = (num)->num>30;

        int input = 40;

        System.out.println(input+" greater than 30 "+integerPredicate.test(input)); // 40>30 ? returns true or false
    }
}
