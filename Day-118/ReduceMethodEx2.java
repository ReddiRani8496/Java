import java.util.List;
import java.util.Optional;

public class ReduceMethodEx2 {

    public static void main(String[] args) {

        List<Integer> list = List.of(111,222,333,444,555);

        Optional<Integer> res = list.stream().reduce((acc,value) -> {

            System.out.println("acc "+acc+" value "+value);

            return acc+value;

        });

        System.out.println(res.get());

    }
}
