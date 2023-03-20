//program to find the maximum difference between two elements in the array
class MaxDiff{
    public static void main(String[] args){
    int arr[]={6,3,8,7,2,9,4};
    int len=arr.length;
    int smallIndex=0;
    int maxIndex=0;
    for(int i=0;i<len;i++){
        if(arr[i]<arr[smallIndex])
        smallIndex=i;
        int diff=smallIndex-maxIndex;
        if(diff>maxIndex)
         maxIndex=diff;
    }
    System.out.println(arr[maxIndex]);
}
}