import java.util.Scanner;

public class CheckArraySorted {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(checkArraySorted(arr,0));
    }

    private static boolean checkArraySorted(int[] arr,int index) {

        if(index==arr.length-1)
            return true;

        if(arr[index]>arr[index+1])
            return false;

        return checkArraySorted(arr,index+1);
    }
}
