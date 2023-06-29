import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {

       int arr[] = {1,2,3,4};
        IntStream res = Arrays.stream(arr);// converting an array of int to stream and stores it using IntStream class

        double arr1[] = {1.3,2.5,8.7};
        DoubleStream res1 = Arrays.stream(arr1); // converting an array of double to stream and stores it using DoubleStream class

        long arr2[] = {423254344,735654452,75654432};
        LongStream res2 = Arrays.stream(arr2);// converting an array of long to stream and stores it using LongStream class

       // float arr3[] = {4.3f,5.6f,9.8f}; there will be no Float stream, only int,double,long streams available

    }
}