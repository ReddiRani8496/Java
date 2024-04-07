package Recursion;
import java.util.*;

public class LastOccuranceOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println(lastOccurance(arr,arr.length-1, key));
    }
    public static int lastOccurance(int[] arr, int index, int key) {
        if(index == arr.length)
            return -1;
        if(arr[index] == key)
            return index;
        return lastOccurance(arr, index-1, key);
    }
}
