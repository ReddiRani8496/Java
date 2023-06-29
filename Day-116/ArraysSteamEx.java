import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArraysSteamEx {
    public static void main(String[] args) {

        int arr[] ={1,2,3,4};
        IntStream res = Arrays.stream(arr,1,3);
        res.forEach(System.out::println);

        double arr1[] = {3.4,5.6,8.7};
        DoubleStream ans = Arrays.stream(arr1,0,2);
        ans.forEach(System.out::println);

        long arr2[] = {23434,5555554,3422323,898347};
        LongStream stream = Arrays.stream(arr2,0,2);
        stream.forEach(System.out::println);
    }
}
