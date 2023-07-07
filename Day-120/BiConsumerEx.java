import java.util.function.BiConsumer;

public class BiConsumerEx {

    public static void main(String[] args) {

        BiConsumer<Integer,String> biConsumer = (n1,n2)-> System.out.println(n2+" is "+n1);

        biConsumer.accept(10,"this");

    }
}
