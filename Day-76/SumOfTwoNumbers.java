// program to find sum of two numbers equal to given sum using hashmap
import java.util.*;
public class SumOfTwoNumbers {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        int arr[]={11,2,5,8,9,4,6};

        int target = 10;

        for(int i=0;i<arr.length;i++) {

            map.put(arr[i],"x");

        }
        for(var x : map.keySet()) {

            int cur = x; 

            int reqTarget = target - cur;

            if(map.containsKey(reqTarget))

                System.out.println(x +" + "+reqTarget+" = "+target);
        
        }
    }
}
