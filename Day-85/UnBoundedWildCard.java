import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class UnBoundedWildCard {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40);

        System.out.println(list);

        List<Double> list1 = new LinkedList<>();

        list1.add(45.98);

        list1.add(83.23);

        list1.add(10.5);
        
        System.out.println(list1);
    }

    public static void numbers(List<?> t) {

        System.out.println(t);
    }
}