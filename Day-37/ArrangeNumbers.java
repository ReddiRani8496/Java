/*Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2.
Input Format :
 Integer n
Output Format :
 Elements of the array separated by space.
Sample Input 1 :
6
Sample Output 1 :
 1 3 5 6 4 2
Sample Input 2 :
9
Sample Output 2 :
 1 3 5 7 9 8 6 4 2
 */
 import java.util.Arrays;
 class ArrangeNumbers{
    public static void main(String[] args){
        int n=6;
        int arr[]=new int[n];
        int start=1;
        int i;
        for(i=0;i<n/2;i++){
            arr[i]=start;
            start+=2;
        }
        arr[i]=n;
        if(n%2==0)
        start=n-2;
        else
        start=n-1;
        for(int j=i+1;j<n;j++){
            arr[j]=start;
            start-=2;
        }
        System.out.println(Arrays.toString(arr));
    }
 }