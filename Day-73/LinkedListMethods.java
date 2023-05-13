import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        LinkedList list = new LinkedList<>();
        list.add(10); // adding elements to the list
        list.add(23.4f);
        list.add('c'); 
        System.out.println(list);
        list.add(2, "Java");  // Adding element at a particular index by passing as an argument
        System.out.println(list);
        list.addFirst(100); // Adds an element at the starting of the list
        list.addLast("last"); // adds the element at the last index of the list
        System.out.println(list);
        System.out.println(list.contains("last")); // checks if the list contains last
        System.out.println(list.element()); //This method retrieves but does not remove, the head (first element) of this list.
        System.out.println(list.get(1)); // This method returns the element at the specified position in this list.
        System.out.println(list.getFirst()); //This method returns the first element in this list.
        System.out.println(list.getLast()); //This method returns the last element in this list.
        System.out.println(list.indexOf('c')); //returns the index of the first occurrence of the specified element in this list
        System.out.println(list.lastIndexOf(100)); // It returns the index of the last occurrence of the specified element in this list
        list.offer(435); // This method Adds the specified element as the tail (last element) of this list.
        System.out.println(list);
        list.offerFirst("first"); // This method Inserts the specified element at the front of this list.
        System.out.println(list);
        System.out.println(list.peek());//This method retrieves but does not remove, the head (first element) of this list.
        System.out.println(list.peekFirst());//This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        System.out.println(list.peekLast()); // This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
        System.out.println(list.poll()); // This method retrieves and removes the head (first element) of this list.
        System.out.println(list.pollFirst()); // This method retrieves and removes the first element of this list, or returns null if this list is empty.
        System.out.println(list.pollLast()); // This method retrieves and removes the last element of this list, or returns null if this list is empty.
        list.push(345); // This method pushes an element onto the stack represented by this list.
        System.out.println(list);
        list.remove(1); // This method removes the element at the specified position in this list.
        System.out.println(list);
        list.removeFirst(); // This method removes and returns the first element from this list.
        System.out.println(list);
        list.removeLast(); // This method removes and returns the last element from this list.
        System.out.println(list);
    } 
        
}
