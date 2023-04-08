import java.util.Arrays;
class rev{
    public static void main(String[] args){
        int arr[]={5,2,9,7,3,1};
        int len=arr.length;
        int end=arr.length-1;
        for(int i=0;i<len/2;i++){
            int temp=arr[i];
            arr[i]=arr[end];
            arr[end]=temp;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}