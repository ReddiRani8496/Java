import java.util.IdentityHashMap;

// compares the references
public class IdentityHashMapEx {
    public static void main(String[] args) {
        IdentityHashMap<String,Integer> map = new IdentityHashMap<>();
        String s1 = new String("Java");
        String s2=new String("Java");
        map.put(s1,400);
        map.put(s2,300);
        System.out.println(map);
    }
}
