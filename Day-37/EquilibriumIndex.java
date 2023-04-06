//Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
import java.util.Arrays;
class EquilibriumIndex{
    public static void main(String[] args){
      int arr[]={-7,1,5,2,-4,3,0};
      //int arr[]={1,2,3};
      for(int i=0;i<arr.length;i++){
        int lsum=0;
        int rsum=0;
        for(int j=0;j<i;j++)
        lsum+=arr[j];
        for(int j=i+1;j<arr.length-1;j++)
        rsum+=arr[j];
      if(lsum==rsum){
        System.out.println(i);
        return;
      }
      }
      System.out.println(-1);
      
     
    }
}