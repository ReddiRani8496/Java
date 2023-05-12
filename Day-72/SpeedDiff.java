/* 
    program to show the speed difference between ArrayList and Vector
    ArrayList takes less time as compared to Vector
*/ 

import java.util.*;
public class SpeedDiff {
     public static void main(String[] args) {

        int size = 1000000;

        ArrayList<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for(int i = 0; i <= size; i++) {

            arrayList.add(i);

        }

        long end = System.currentTimeMillis();

        System.out.println("Added "+size+" Elements to the ArrayList in "+(end-start)+" ms"); // takes 61ms

        List<Integer> vector = new ArrayList<>();

        start = System.currentTimeMillis();

        for(int i = 0; i <= size; i++) {

            vector.add(i);

        }

        end = System.currentTimeMillis();

        System.out.println("Added "+size+" Elements to the ArrayList in "+(end-start)+" ms"); // takes 81ms

    }
}
