import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,0,size-1,target));
    }
    private static int binarySearch(int[] arr, int start, int end, int target) {

        if(start > end)
            return -1;

        int mid = (start + end) / 2;

        if(arr[mid] == target)
            return mid;

        else if(arr[mid] > target)
            return binarySearch(arr, start, mid-1, target);

        else
            return binarySearch(arr, mid+1, end, target);
    }
}
