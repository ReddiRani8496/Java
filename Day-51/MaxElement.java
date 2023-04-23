//program to find maximum element in the array
public class MaxElement {
    public static void main(String[] args) {
        int arr[]={8,3,9,3,4,7};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)  {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
