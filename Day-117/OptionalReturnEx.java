import java.util.Optional;

public class OptionalReturnEx {
    public static void main(String[] args) {
        value().ifPresentOrElse(n-> System.out.println("value find"),()-> System.out.println(0));
    }
    static Optional<String> value() {
        return null;
    }
}
