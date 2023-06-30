import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
        String name = null;
        Optional<String> nameOptional = Optional.ofNullable(name);

        if(nameOptional.isEmpty()) {
            System.out.println("name is empty");
        }
        else {
            System.out.println(nameOptional.get());
        }

        nameOptional.ifPresentOrElse(n-> System.out.println(n),() -> { // simple for if else method
            System.out.println("name is empty");
        });

        Optional<String> name2 = Optional.ofNullable("mock"); // ofNullable() is used when String can contain null or not
        System.out.println(name2);
        name2.ifPresentOrElse(n-> System.out.println(n.length()),() -> { // returns length of the string, if null returns 0
            System.out.println("0");
        });

    }
}
