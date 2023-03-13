//program to find the element in the array using binary search
import java.util.Arrays;
class BinarySearch{
    public static void main(String[] args){
        int arr[]={3,5,8,12,18,20,25,30};
        int x=12;
        int low=0,end=arr.length-1;
        while(low<=end){
            int mid=(low+end)/2;
            if(arr[mid]==x){
                System.out.println("Element found at index: "+mid);
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
