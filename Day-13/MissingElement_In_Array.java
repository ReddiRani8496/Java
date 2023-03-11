//program to find the missing element in the array
class MissingElement_In_Array{
    public static void main(String[] args){
        int n=6;
        int arr[]={1,3,4,5,6};
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<n-1;i++)
        actualSum+=arr[i];
        System.out.println("missing element="+(expectedSum-actualSum));
    }
}