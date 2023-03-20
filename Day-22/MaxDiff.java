//program to find the maximum difference between two elements in the array
class MaxDiff{
    public static void main(String[] args){
    int arr[]={6,3,8,7,2,9,4};
    int len=arr.length;
    int smallIndex=arr[0];
    int maxIndex=0;
    for(int i=0;i<len;i++){
        if(arr[i]<smallIndex){
        smallIndex=arr[i];
        maxIndex=0;
        }
        int diff=arr[i]-smallIndex;
        if(diff>maxIndex)
         maxIndex=diff;
    }
    System.out.println(maxIndex);
}
}