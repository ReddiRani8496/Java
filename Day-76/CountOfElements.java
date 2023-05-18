import java.util.*;

public class CountOfElements {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int arr[] = {8,4,5,7,3,6,8,4,5,2,8,6,3};

        for(int i = 0; i < arr.length; i++) {

            if(!map.containsKey(arr[i])) {

                map.put(arr[i], 1);

            }
            else {

                int preValue = map.get(arr[i]);

                map.put(arr[i],preValue+1);
            }
        }
         
        System.out.println(map);
    }
}
