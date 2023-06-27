// the reduce() method takes a sequence of input elements and combines them into a single
// summary result by repeated operation.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(8,9,4,5,3,7,14,24,38,38);

        Stream<Integer> stream = list.stream();

      // Integer res = stream.map(n->n).reduce(0,(ans,i)->(ans+i)); //calculating sum

        Integer result = stream.map(n->n).reduce(0,Integer::sum); // calculating sum, by using method reference

        System.out.println(result);
    }
}
