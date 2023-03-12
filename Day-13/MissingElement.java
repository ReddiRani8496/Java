//program to find the missing element in the array,if min and max elements of the array are given
class MissingElement{
   public static void main(String[] args){
       int arr[]={13,14,12,15};
        int n=arr.length;
         int min=11;
        int max=15;
      int maxSum=max*(max+1)/2;
       int minSum=(min-1)*(min)/2;
       int expectedSum=maxSum-minSum;
        int actualSum=0;
        for(int i=0;i<n;i++)
        actualSum+=arr[i];
        System.out.println(expectedSum-actualSum);
       
    }
    
}
