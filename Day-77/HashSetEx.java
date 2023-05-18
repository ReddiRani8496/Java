import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10); // adds elements into set

        set.add(20);

        set.add(30);

        set.add(40);

        System.out.println(set);

        System.out.println(set.size()); // returns the size of the set

        System.out.println(set.contains(30)); // checks if the element contains in set or not

        System.out.println(set.isEmpty()); // checks whether the set is empty or not

        set.remove(40); // removes the specified element from the set

        System.out.println(set);

        set.clear();

        System.out.println(set);
    }
}
