import java.util.Arrays;

import java.util.List;

public class SumUsingGenerics {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40);
        
        numbers(list);

    }

    public static void numbers(List<? extends  Number> t) {

        int sum = 0;

        for(Number x : t)

         sum += x.intValue();
         
        System.out.println(sum);
    }
}

