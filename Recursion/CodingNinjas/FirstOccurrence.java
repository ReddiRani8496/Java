import java.util.Scanner;
public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(firstOccurrence(arr,0,key));
    }

    private static int firstOccurrence(int[] arr, int index, int key) {

        if(index == arr.length)
            return -1;

        if(arr[index] == key)
            return index;

        return firstOccurrence(arr, index+1, key);
    }
}
