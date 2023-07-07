import java.util.function.IntConsumer;

public class IntConsumerEx {
    public static void main(String[] args) {

        IntConsumer intConsumer = n -> System.out.println(n);
        
        intConsumer.accept(10);
    }
}
