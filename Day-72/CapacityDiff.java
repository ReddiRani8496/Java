/*
 * program to show the capacity difference between ArrayList and Vector
 * ArrayList increases the capacity by 50%
 * Vector increases the capacity by 100%
 */

import java.util.*;
public class CapacityDiff {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);
        System.out.println(arrayList.size());
        arrayList.add(10);
        arrayList.add(10);
        System.out.println(arrayList.size());
        System.out.println();

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(10);
        System.out.println(vector.capacity()); //10
        vector.add(20);
        vector.add(30);
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println(vector.capacity()); // doubles the size i.e. 10+10=20
        
        

    }
}
