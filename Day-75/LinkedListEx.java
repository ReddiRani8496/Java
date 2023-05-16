// program to illustrate LinkedList using Queue interface

import java.util.*;;
public class LinkedListEx {
    public static void main(String[] args) {

        Queue<Integer> linkedList = new LinkedList<>();

        linkedList.add(10); // adds the elements into linkedlist

        linkedList.add(20);

        linkedList.add(30);

        System.out.println(linkedList);

        linkedList.remove(); // removes the first element from the linkedlist

        System.out.println(linkedList);

        System.out.println(linkedList.contains(40)); // The method checks whether a linkedlist contains the element or not

        System.out.println(linkedList.isEmpty());// The method checks whether the linkedlist is empty or not.

        System.out.println(linkedList.offer(70)); // The method inserts element at the end of linkedlist.

        System.out.println(linkedList.size()); // Returns the number of elements in this linkedlist.

        System.out.println(linkedList.element()); //The method returns element at the head of the linkedlist

        System.out.println(linkedList.getClass()); // This method returns the class name

        System.out.println(linkedList.peek()); // This method returns the head element without removing it.

        System.out.println(linkedList.poll()); // The method returns head element and also removes it

        for(Integer integer : linkedList) {

            System.out.println(integer);
        }

        linkedList.clear(); // The method clears all the elements in the linkedlist

        System.out.println(linkedList);
    }
}
