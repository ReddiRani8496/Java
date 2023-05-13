import java.util.*;
public class LinkedListVsArrayList {
    public static void main(String[] args) {
        
                List<Integer> list = new LinkedList<>();
         
                for (int i = 0; i < 5_000_000; i++) {
                    list.add(i);
                }
         
                long start = System.currentTimeMillis();
         
                for (int i = 0; i < 100; i++) {
                    list.add(2_000_000, Integer.MAX_VALUE);
                }
                System.out.println("Time taken by LinkedList (in milliseconds) = " + (System.currentTimeMillis()-start)); //takes 719ms

                List<Integer> arraylist = new ArrayList<>();
                
                for (int i = 0; i < 5_000_000; i++) {
                    arraylist.add(i);
                }
         
                 start = System.currentTimeMillis();
         
                for (int i = 0; i < 100; i++) {
                    list.add(2_000_000, Integer.MAX_VALUE);
                }
                System.out.println("Time taken by ArrayList (in milliseconds) = " + (System.currentTimeMillis()-start)); // takes 715ms
    }
}
/* How did ArrayList takes less time?
 * => First, the time required for ArrayList to access elements is fixed (constant). 
 * 
    ArrayList [2_000_000] is a specific memory address (after all, the list has an internal array).

    A LinkedList does not have an array. It will search for element number 2_000_000 along the chain of links. 

        For LinkedList, this is not a memory address, but a link that still needs to be reached: next, next, next ............
    
    As a result, during each insertion (removal) in the middle of the list, ArrayList already knows the exact memory address to access,
         but LinkedList still needs to "get there".

   => Second, there is the structure of the ArrayList itself. A special internal function (System.arrayCopy()) expands the internal array,
         and copies and shifts all the elements. It is very fast, because it is optimized for this specific work.
*/
