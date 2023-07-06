import java.util.List;

public class IntermediateMethods {
    public static void main(String[] args) {
        List<Integer> list = List.of(6,3,9,1,2,5,3,1);
        list.stream()
                .distinct() // takes only unique elements
                .sorted() // sorting the unique elements
                .map(element -> element * element * element) // finding cube of each element
                .filter(element -> element < 10000) // filtering the elements less than 10000
                .forEach(
                        element -> System.out.print(element + " "));


        list.stream()
                .distinct()
                .sorted()
                .map(element -> element * element * element)
                .forEach(
                        element -> System.out.print(element + " ")); // printing the unique elements cubes without filtering
    }
}
