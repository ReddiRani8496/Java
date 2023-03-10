//program to move all zeores to end of array
import java.util.Arrays;
class Sorting_Zeroes{
    public static void main(String[] args){
        int arr[]={16,0,4,2,0,8,5,0};
       int nonZero=0;
       int n=arr.length;
       for(int i=0;i<n;i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[nonZero];
            arr[nonZero]=temp;
            nonZero++;
        }
       }
       System.out.println(Arrays.toString(arr));
    }
}