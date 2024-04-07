package Recursion;

import java.util.Scanner;

public class FirstOccuranceOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println(firstOccurance(arr,0, key));
    }
    public static int firstOccurance(int[] arr, int index, int key) {
        if(index == arr.length)
            return -1;
        if(arr[index] == key)
            return index;
        return firstOccurance(arr, index+1, key); 
    }
}
