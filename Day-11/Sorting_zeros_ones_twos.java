//program to sort the arrays of zeros,ones and twos 
import java.util.Arrays;
class Sorting_zeros_ones_twos{
    public static void main(String[] args){
        int arr[]={0,1,0,2,2,1,0,1,0,2,1,1,0,2};
        int len=arr.length;
        int zeros=0,ones=0,twos=0;
        for(int i=0;i<len;i++){
            if(arr[i]==0)
            zeros++;
            else if(arr[i]==1)
            ones++;
            else
            twos++;
        }
        for(int i=0;i<zeros;i++)
        arr[i]=0;
        for(int i=zeros;i<zeros+ones;i++)
         arr[i]=1;
         for(int i=zeros+ones;i<len;i++)
         arr[i]=2;
        System.out.println(Arrays.toString(arr));
    }
}