import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        int arr[] = {7,4,5,9,2,0,2};

        System.out.println(arr.length); // length is 7

        for(int i = 0; i < arr.length; i++) {

            set.add(arr[i]);
        }

        System.out.println(set);

        System.out.println(set.size()); // size is 6, since HashSet doesn't allow duplicates
    }
}
