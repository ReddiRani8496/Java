//program to find the kth largest and the smallest number in an array
import java.util.Arrays;
import java.util.Scanner;
class Kth_ElementIn_Array{
    public static void main(String[] args){
        int arr[]={6,7,9,2,4,13,15,24,18};
        Arrays.sort(arr);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the k value for largest element:");
        int k=sc.nextInt();
          System.out.println(k+"nd/th largest element is: "+arr[arr.length-k]); // to find the Kth largest element
        System.out.println("Enter the n value for smallest element:"); 
        int n=sc.nextInt();
        System.out.println(n+"nd/th smallest element is: "+arr[k-1]); // to find the Kth smallest element
    }
}