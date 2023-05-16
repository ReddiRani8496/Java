import java.util.PriorityQueue;
import java.util.*;
class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(55); //adds the elements into priorityqueue
        priorityQueue.add(80);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(90);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek()); //Printing the top element of PriorityQueue
        System.out.println(priorityQueue.remove(55)); //Retrieves and removes the head of this queue.
        System.out.println(priorityQueue.size()); // Get the size of the queue
        System.out.println(priorityQueue.element()); //Retrieves, but does not remove, the head of this queue.
        System.out.println(priorityQueue.poll());  // Printing the top element and removing it
        System.out.println(priorityQueue.getClass()); //returns the class name
        System.out.println(priorityQueue.contains(20));  // Check if the queue contains a specific element
        System.out.println(priorityQueue.isEmpty());  // Check if the queue is empty
        System.out.println(priorityQueue.offer(33)); 

        Iterator iterator = priorityQueue.iterator();
 
        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");
        }
        priorityQueue.clear();  // Remove all elements from the queue
        System.out.println(priorityQueue);
    }
}