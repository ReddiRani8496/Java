import java.util.*;

class HashMapEx {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "John"); // adding elements 

        map.put(102, "king");

        map.put(103, "Nick");

        System.out.println(map);

        map.put(103, "David"); // modifying the elements

        System.out.println(map);

        map.remove(102); // removing the element, by passing key

        System.out.println(map);

        for(Map.Entry<Integer, String> e : map.entrySet()) // traversal of hashmap

            System.out.println(e.getKey()+" : "+ e.getValue());

        System.out.println(map.get(101)); //returns the value to which the specified key is mapped

        System.out.println(map.isEmpty()); // returns true if this map contains no key-value mappings, otherwise returns false

        System.out.println(map.keySet()); // returns the keys contained in this map

        System.out.println(map.size()); //returns the number of key-value mappings in this map

        System.out.println(map.values()); // returns the values contained in this map

        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(101, "John");

        map1.put(103, "David");

        System.out.println(map.equals(map1)); // checks the equality between two maps

        map1.put(102, "king");

        System.out.println(map.equals(map1));

    }
}