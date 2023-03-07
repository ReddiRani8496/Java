import java.util.Arrays;
class Reverse_The_Array{
    public static void main(String[] args){
        int arr[]={8,5,3,12,15,20,25};
        int end=arr.length-1;
        for(int i=0;i<(arr.length/2);i++)
         {
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;
         }
         System.out.println(Arrays.toString(arr));
    }
}