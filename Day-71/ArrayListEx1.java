import java.util.*;
public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(110); // adding elements to the ArrayList

        arr.add(20);
        
        arr.add(30);
        
        arr.add(40);
        
        arr.add(50);
        
        arr.add(60);
        
        arr.add(70);
        
        arr.add(80);
       
        System.out.println(arr.get(3)); // Accessing an element in the ArrayList

        arr.set(1,120); // modifying an element in the ArrayList

        System.out.println(arr);

        System.out.println(arr.remove(4)); //removing an element in the ArrayList

        System.out.println(arr.size()); // finding the size of the ArrayList

        Collections.sort(arr); // sorting an ArrayList

        System.out.println(arr);

        arr.add(3, 35); // inserts element at index 3

        System.out.println(arr);

        boolean ans = arr.contains(120);  // check if the element  120 exits or not

        System.out.println(ans);

        int pos =arr.indexOf(60); //returns the position of 60

        System.out.println(pos);

        ans = arr.isEmpty(); // check if the list is empty or not

        System.out.println(ans);

        
    }
}
