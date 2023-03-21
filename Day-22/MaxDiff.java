//program to find the maximum difference between two elements such that larger element appears after the smaller number
class MaxDiff{
    public static void main(String[] args){
        int arr[]={7,9,5,6,3,2};
        int len=arr.length;
        int min=arr[0];
        int max=0;
        for(int i=1;i<len;i++){
            if(arr[i]<min)
            min=arr[i];
            int diff=arr[i]-min;
            if(diff>max)
            max=diff;
        }
        System.out.println(max);
    }
}