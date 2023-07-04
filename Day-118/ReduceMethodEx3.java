import java.util.List;
import java.util.Optional;

public class ReduceMethodEx3 {

    public static void main(String[] args) {

        List<String> list = List.of("rock","the","world");

        Optional<String> res = list.stream().reduce((acc,value) -> {

            return acc.toUpperCase();

        });

        System.out.println(res.get());

    }
}
