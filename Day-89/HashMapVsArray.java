import java.util.Arrays;
import java.util.HashMap;

public class HashMapVsArray {
    static HashMap<Integer,Integer> hashMap = new HashMap<>(); //each player takes 32+32=64 bits memeory

    public static void main(String[] args) {

        int noOfPlayers = 6;

        for (int i = 1; i <= noOfPlayers; i++) {

            hashMap.put(i,1);

        }

        hashMap.put(1,0);

        System.out.println(hashMap.get(1));

        System.out.println(hashMap.get(4));

        int[] arr = new int[noOfPlayers]; // each player takes 32bits memory, it saves memory compared to hashmap

        Arrays.fill(arr,1);

        arr[4] =0;

        System.out.println(arr[4]);
    }
}
