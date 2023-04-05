//program to search (binarysearch) an element using recursion
class BinarySearch{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int element=15;
        System.out.println(binarySearch(arr,element,0,arr.length-1));
    }
    static boolean binarySearch(int arr[],int element,int low,int end){
        if(low<=end){
            int mid=(low+end)/2;
            if(arr[mid]==element)
            return true;
           else if(arr[mid]>element)
            return binarySearch(arr,element,low,end=mid-1);
            else return binarySearch(arr,element,low=mid+1,end);
        }
        return false;
    }
}