import java.util.Arrays;
class Sorting_Zeroes_Ones{
    public static void main(String[] args){
        int arr[]={0,1,0,0,1,1,0};
        int zeroes=0;
        int ones=1;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==0)
           zeroes++;
           else
           ones++;
        }
        int i;
        for(i=0;i<zeroes;i++){
            arr[i]=0;
        }
        for(int j=i;j<arr.length;j++)
        arr[j]=1;
        System.out.println(Arrays.toString(arr));
    }
}