import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};

        System.out.println(Arrays.toString(arr));

        int arr1[][] = {
                        {10,20,30},
                        {40,50,60},
                        {34,56,29}
                      };
       // System.out.println(Arrays.toString(arr1)); // returns the address of each row

        System.out.println(Arrays.deepToString(arr1)); // converting multidimensional arrays to strings.
    }    
}
