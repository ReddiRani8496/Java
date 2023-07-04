import java.util.List;

public class ReduceMethodEx1 {

    public static void main(String[] args) {

        List<String> list = List.of("R","O","C","K","I","S","G","O","O","D");

        String res = list.stream().reduce("THE",(acc,val)->acc+val);
        
        System.out.println(res);
    }
}
