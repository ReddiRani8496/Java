//program to find the element in the array using linear search
import java.util.Scanner;
class LinearSearch{
    public static void main(String[] args){
        int arr[]={6,2,9,12,8};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int n=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }
}