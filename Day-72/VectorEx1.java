import java.util.Vector;
class VectorEx1 {
    public static void main(String[] args) {
        Vector items = new Vector();

        items.add(10); // adding an Integer element in the vector

        items.add(20);

        items.add(30);

        items.add(40);

        System.out.println(items);

        items.add("vector"); // adds String element in the vector

        System.out.println(items);

        items.add(32.33);  // adding double element in the vector

        System.out.println(items);

        items.add('c'); // adding character element in the vector

        System.out.println(items);

        items.remove(3); // removes the element at index 3

        System.out.println(items);

        items.set(0, 90); // modifies the element at 0

        System.out.println(items);

        System.out.println(items.get(2)); // accessing an element at index 2

        for(var i : items)
            System.out.println(i);
        
    }
}