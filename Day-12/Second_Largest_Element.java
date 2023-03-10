//program to find the second largest element in the array
class Second_Largest_Element{
    public static void main(String[] args){
        int arr[]={16,17,8,3,5,2};
        int len=arr.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
           else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        System.out.println("Second largest element in the array is: "+max2);
    }
}