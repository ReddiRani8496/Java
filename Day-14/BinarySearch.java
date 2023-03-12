//program to find the element in the array using binary search
import java.util.Arrays;
class BinarySearch{
    public static void main(String[] args){
        int arr[]={8,5,9,1,2,15,22};
        Arrays.sort(arr); //to search element by using binary search, array must be sorted
        int x=6;
        int low=0,end=arr.length-1;
        while(low<=end){
            int mid=(low+end)/2;
            if(arr[mid]==x){
                System.out.println("Element found");
                return;
            }
            else if(arr[mid]>x)
            end=mid-1;
            else if(arr[mid]<x)
            low=mid+1;
            
        }
        System.out.println("Element not found");
    }
}
