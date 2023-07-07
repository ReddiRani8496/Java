import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionPackage {

    public static void main(String[] args) {

        Predicate<Integer> predicate = n->n%10==0;

        System.out.println(predicate.test(20)); // returns boolean value

        Consumer<Integer> consumer = n-> System.out.println(n+"the");

        consumer.accept(12);

        Function<Character,Integer> function = c->c+10; //accepts any argument type transforms it and retun a result

        System.out.println(function.apply('a'));

        Supplier supplier = () ->"supplier string";

        System.out.println(supplier.get());

        Supplier supplier1 = () ->10; // doesn't accept any argument but produce result of any datatype

        System.out.println(supplier1.get());


    }
}
