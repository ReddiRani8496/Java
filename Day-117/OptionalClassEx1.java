import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        printUpperCase(Optional.ofNullable(null));
    }
    public  static  void printUpperCase(Optional<String> name) {
        /* normal approach, bad practice
        if(!(name == null))
            System.out.println(name.toUpperCase());
         else
             System.out.println("Name is empty");
         */

        // best approach
        if(name.isEmpty())
            System.out.println("name is empty");
        else
            System.out.println(name.get());

        name.ifPresentOrElse(n-> System.out.println(n.length()),()->{
            System.out.println("0");
        });

    }
}