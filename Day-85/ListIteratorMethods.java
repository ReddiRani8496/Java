import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
    
public class ListIteratorMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);

        list.add(20);

        list.add(30);

        list.add(40);

        ListIterator<Integer> listIterator =list.listIterator();
    
        System.out.println(listIterator.hasNext());
    
        System.out.println(listIterator.next());
    
        System.out.println(listIterator.hasPrevious());
    
        listIterator.remove();
    
        while (listIterator.hasNext())
    
            System.out.print(listIterator.next()+"\t");
    
        System.out.println();
            
        while (listIterator.hasPrevious()) {
    
            System.out.print(listIterator.previous()+"\t");
        }
    }
}
