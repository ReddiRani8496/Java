import java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {

        int arr[] = new int[10];

        System.out.println(Arrays.toString(arr)); // the default values of int array is 0

        Arrays.fill(arr,8); // filling entire array with 8

        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr,0,7,2);
        
        System.out.println(Arrays.toString(arr));
    }    
}
