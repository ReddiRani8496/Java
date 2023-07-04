import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(3);
        hashSet.add(6);
        hashSet.add(5);
        System.out.println(hashSet);

        boolean result = HashSetEx.contains(6);
        System.out.println(result);
    }
    static boolean contains(int key) { // time complexity O(1)
        if(key != -1)
            return true;
        else
            return false;
    }
}
