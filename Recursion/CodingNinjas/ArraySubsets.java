import java.util.ArrayList;
import java.util.List;

public class ArraySubsets {
    static List<List<Integer>> lists = new ArrayList<>();
    public static void main(String[] args) {
        int arr[] = {5, 12, 3, 17, 1, 18, 15, 3, 17 };
        int output[] =new int[0];
       // printSubsets(arr,output,0);
        int sum = 6;
       // subSetSum(arr,sum,0,output);
//        int[][] ar1 = returnSubsetsK(arr,0,sum);
//        for (int i = 0; i < ar1.length; i++) {
//            for (int j = 0; j < ar1[i].length; j++) {
//                System.out.print(ar1[i][j]+" ");
//            }
//            System.out.println();
//        }
        subSetSum(arr,sum,0,output);
        for (List<Integer> list : lists)
            System.out.println(list);
    }

    private static void subSetSum(int[] arr, int sum, int index,int[] output) {
        if(index==arr.length) {
            if(sum==0) {
//                for (int i = 0; i < output.length; i++) {
//                    System.out.print(output[i]+" ");
//                }
//                System.out.println();
                List<Integer> list = new ArrayList<>();
                for(int i:output)
                    list.add(i);
                lists.add(list);
                return;
            } else {
                return;
            }
        }

        int temp[] = new int[output.length+1];
        System.arraycopy(output,0,temp,0,output.length);
        temp[output.length]=arr[index];

        subSetSum(arr,sum,index+1,output);
        subSetSum(arr,sum-arr[index],index+1,temp);
    }



    private static void printSubsets(int[] arr, int[] output, int index) {
        if(index==arr.length) {
            for (int j : output) {
                System.out.print(j + " ");
            }
            System.out.println();

            return;
        }

        int[] temp = new int[output.length+1];
        System.arraycopy(output,0,temp,0,output.length);
        temp[output.length] = arr[index];

        printSubsets(arr,output,index+1);
        printSubsets(arr,temp,index+1);
    }

    private static int[][] returnSubsetsK(int[] arr,int index, int sum) {
        if(index==arr.length) {
            if(sum==0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }
        }

        int[][] temp1 = returnSubsetsK(arr,index+1,sum);
        int[][] temp2 = returnSubsetsK(arr,index+1,sum-arr[index]);

        int[][] output = new int[temp1.length+ temp2.length][];

        int j=0;
        for (int i = 0; i < temp1.length; i++) {
            output[j++]=temp1[i];
        }

        for (int i = 0; i < temp2.length; i++) {
            output[j]= new int[temp2[i].length+1];
            output[j][0]=arr[index];
            for (int k = 0; k < temp2[i].length; k++) {
                output[j][k+1] = temp2[i][k];
            }
            j++;
        }
        return output;
    }


}
