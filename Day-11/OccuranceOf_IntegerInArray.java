//program to find the occurance of an Integer in the array
import java.util.Scanner;
import java.util.Arrays;
class OccuranceOf_IntegerInArray{
    public static void main(String[] args){
        int arr[]={6,3,9,7,11,2,3,4,9,6,3,9,7,9};
        int occurance=0;
        int len=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to find the occurance: ");
        int element=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<len;i++){
            if(arr[i]==element)
            occurance++;
            if(arr[i]>element)
            break;
        }
        System.out.println("The occurance of "+element+" in the array is:"+occurance);
    }
}