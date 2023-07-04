import java.util.List;

public class ReduceMethodEx {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4);

        int res = list.stream().reduce(0,(acc,value)->acc+value);

        System.out.println(res);
    }
}
