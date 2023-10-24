import java.util.WeakHashMap;

//weak hashmap supports if there is more than one reference
public class WeakHashMapEx {
    public static void main(String[] args) {
        WeakHashMap<String,Integer> map = new WeakHashMap<>();
        String s1 = new String("Java");
        String s2 = s1;
        map.put(s1,100);
        System.out.println(map);
     //   s1=s2=null;
       // System.out.println(map); // still it gives output because garbage collector not collected s1 and s2, so 3 references are there
        s1=s2=null;
        System.gc(); // explicitly calling garbage collector
        System.out.println(map);

    }
}

