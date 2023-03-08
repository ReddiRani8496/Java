//program to sort the given array
import java.util.Arrays;
class Sorting_Array{
    public static void main(String[] args){
        int arr[]={6,1,26,15,18,11,9,3};
        int len=arr.length;
        // SORTING IN ASCENDING ORDER
        for(int i=0;i<len;i++){
            int small=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[small])
                small=j;
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        System.out.println(Arrays.toString(arr));
        //SORTING IN DESCENDING ORDER
        for(int i=0;i<len;i++){
            int largest=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]>arr[largest])
                largest=j;
            }
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}