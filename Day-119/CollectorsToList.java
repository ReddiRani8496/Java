import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToList {
    public static void main(String[] args) {
        List<String> list1 = List.of("Milk","is","white");
        List<String> list2 = List.of("sun","raises","in","the","east");
        List<String> list3 = List.of("weather","is","too","hot");
        String result = list1.stream().collect(Collectors.joining(" ",">>>","<<<"));
        List<String> newList1 = list1.stream().map(n->n+"*").collect(Collectors.toList());
        List<String> newList2 = list2.stream().map(n->n+"*").toList();
        System.out.println(newList1);
        System.out.println(newList2);
        Set<String> newSet = list2.stream().map(n->n+" - ").collect(Collectors.toSet());
        list3.stream().collect(Collectors.toMap(n1->n1,n2->n2));
        Map<String,String> mapMan = list3.stream().collect(Collectors.toMap(n1->n1,n2->n2));
        System.out.println(mapMan);
        Map<String,Integer> mapMan1 = list3.stream().collect(Collectors.toMap(n1->n1+"key",n2->n2.length()));
        System.out.println(mapMan1);
    }
}
