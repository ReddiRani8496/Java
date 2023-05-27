import java.util.Arrays;
import java.util.List;


public class GenericLowerBound {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        System.out.println(list);

        List<Number> list1 = Arrays.asList(34.56, 23.45, 89.43);

        System.out.println(list1);
    
    }

    public static void numbers(List<? super Number> t) {

        System.out.println(t);
    }
}