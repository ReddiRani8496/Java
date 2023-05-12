import java.util.*;

class VectorEx {
    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<>();  // stores Integer values

        v.add(10);

        v.add(20);

        v.add(30);

        System.out.println(v);

        v.remove((Object)20); // removes specified element in the vector

        System.out.println(v);

        v.insertElementAt(50, 2); // inserts element at the specified index

        System.out.println(v);
    }
}