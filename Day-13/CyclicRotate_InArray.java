//program to cyclically rotate an array by one
import java.util.Arrays;
class CyclicRotate_InArray{
    public static void main(String[] args){
        int arr[]={6,8,3,5,4};
        int len=arr.length;
        int lastElement=arr[len-1];
        for(int i=len-1;i>0;i--)
        arr[i]=arr[i-1];
        arr[0]=lastElement;
        System.out.println(Arrays.toString(arr));
    }
}