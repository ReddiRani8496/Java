import java.util.function.Consumer;

public class ConsumerAndThen {

    public static void main(String[] args) {

        Consumer<Integer> c1 = d-> System.out.println(d+50);

        Consumer<Integer> c2 = d -> System.out.println(d+20);

        Consumer<Integer> c3 = d-> System.out.println(d+30);

        c1.andThen(c2).andThen(c3).accept(10);

    }
}
