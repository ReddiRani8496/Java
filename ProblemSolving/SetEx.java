import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
       Set<Integer> set = new HashSet<>();
       set.add(10);
       set.add(20);
       for(var x:set){
           System.out.println(x);
       }
       Set<Integer> set1 = new LinkedHashSet<>(); // elements in the insertion order
       set1.add(30);
       set1.add(25);
       set1.add(35);
       set1.add(15);
       for(var x:set1)
           System.out.println(x);
       // to get elements in sorted order use Tree set only homogenous elements sorted
        // Tree set does not allow null
        // linked and hassets allow null

        Set<Integer> set2 = new TreeSet<>();
        set2.add(19);
        set2.add(10);
        set2.add(40);
        set2.add(50);
        set2.add(30);
      //  set2.add(null); throws null pointer exception
        for(var x: set2)
            System.out.println(x);

    }
}
