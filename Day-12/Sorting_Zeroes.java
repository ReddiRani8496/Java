//program to move all zeores to end of array
import java.util.Arrays;
class Sorting_Zeroes{
    public static void main(String[] args){
        int arr[]={16,0,4,2,0,8,5,0};
        int len=arr.length;
    
        for(int i=len-1;i>=0;i--){
            if(arr[i]!=0)
            for(int j=0;j<i;j++){
            if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }}
        System.out.println(Arrays.toString(arr));
    }
}