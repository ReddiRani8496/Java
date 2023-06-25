/*
 * GC Overhead limit exceeded:
 * --------------------------
 * 
 * This exception is typically thrown because the amount of live data barely 
 *  fits into the Java heap having little free space for new allocations. 
 */
import java.util.*;
public class OutOfMemoryEx2 {
     public static void main(String args[]) throws Exception
    {
        Map m = new HashMap();
        m = System.getProperties();
        Random r = new Random();

        while (true) {
            m.put(r.nextInt(), "randomValue");
        }
    }
}
