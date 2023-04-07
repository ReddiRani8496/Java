import java.util.Arrays;
class Union{
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        int arr1[]={5,3,8,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j])
                break;
                else
                arr[i]=arr1[j];
               }
 
        }
      System.out.println(Arrays.toString(arr));
    }
}