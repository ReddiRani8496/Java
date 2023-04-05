//program to sum the elements in the array using recursion
class ArraySum{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println(arraySum(arr,0));
    }
    static int arraySum(int arr[],int start){
        if(start==arr.length)
        return 0;
        return arr[start]+arraySum(arr,start+1);
    }
}