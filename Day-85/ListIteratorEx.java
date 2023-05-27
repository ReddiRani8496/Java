import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);

        list.add(20);

        list.add(30);

        ListIterator<Integer> listIterator = list.listIterator();

        while(listIterator.hasNext()) // initially the cursor at -1 index,
                                      // the loop repeats until the last index reached
    
            System.out.print(listIterator.next()+"\t");
    
        System.out.println();
    
        while (listIterator.hasPrevious()) // after the hasNext() loop the cursor will be last index, 
                                           // repeats the loop till 0 index reached
    
            System.out.print(listIterator.previous()+"\t");
    
        }
    
    }  

