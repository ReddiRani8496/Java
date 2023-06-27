/*
 the Consumer interface is a functional interface from the java.util.function package.
 It represents an operation that takes in a single input argument and does not return any result.
  It is often used in functional programming and can be used with lambda expressions or method references.
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,6,7,8,9);
        Consumer<Integer> consumer = new Consumer<Integer>() { // implementing consumer class using anonymous class
            @Override
            public void accept(Integer integer) {
                System.out.println("Items: "+integer);
            }
        };

        list.forEach(consumer);

        Consumer<Integer> consumer1 = n -> System.out.println(n); // Consumer is a functional interface, it can be implemented by using lambda expression

        list.forEach(consumer1);

        list.forEach(n -> System.out.println("items "+n));

        list.forEach(System.out::println); // iterating using forEach() loop and printing using method reference
    }
}
