import java.util.ArrayDeque;
import java.util.Deque;
class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(10); // This method adds an element 
        deque.add(20);
        deque.add(30);
        deque.add(40);
        System.out.println(deque);
        deque.remove(); // 	The method returns head element and also removes it
        System.out.println(deque);
        deque.addFirst(50); //The method inserts particular element at the start of the deque.
        deque.addLast(60); //The method inserts particular element at the last of the deque.
        System.out.println(deque);
        System.out.println(deque.contains(30)); //The method checks whether a deque contains the element or not
        System.out.println(deque.element()); //The method returns element at the head of the dequ
        System.out.println(deque.getClass()); // This method returns the class name
        System.out.println(deque.isEmpty()); // The method checks whether the deque is empty or not.
        System.out.println(deque.offer(70)); // The method inserts element at the end of deque.
        System.out.println(deque.offerFirst(0)); // The method inserts element at the front of deque.
        System.out.println(deque.size()); // Returns the number of elements in this deque.
        System.out.println(deque.getFirst()); // The method returns first element of the deque
        System.out.println(deque.getLast()); //The method returns last element of the deque
        System.out.println(deque.peek()); // The method returns head element without removing it.
        System.out.println(deque.getLast()); // The method returns last element of the deque
        System.out.println(deque.poll()); // The method returns head element and also removes it
        System.out.println(deque.pollFirst()); //Retrieves and removes the first element of this deque, or returns null if this deque is empty.
        System.out.println(deque.pollLast()); // Retrieves and removes the last element of this deque, or returns null if this deque is empty.
        deque.push(50); // pushes the element into the deque
        System.out.println(deque);
        System.out.println(deque.removeLastOccurrence(50)); // removes the last occurance of the specified element
        System.out.println(deque.pop()); // The method pops out an element for stack represented by deque
        
        for (Integer integer : deque) {
            System.out.println(integer);
        }
        deque.clear(); // clears all the elements in the ArrayDeque
        System.out.println(deque);
    }
}
