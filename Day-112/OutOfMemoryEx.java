/*
 * If the finalizer thread cannot keep up with the finalization queue, 
 * 
 *  the Java heap could fill up, and this type of OutOfMemoryError exception would be thrown.
 * 
 * this error is thrown when the Java Virtual Machine cannot allocate an object because it is out of memory.
 *   
 *    No more memory could be made available by the garbage collector.
*/

import java.util.*;

public class OutOfMemoryEx {
    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception
    {
        Integer[] array = new Integer[1000000 * 1000000];
    }
}


