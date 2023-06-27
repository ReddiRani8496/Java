import java.util.function.Function;

public class FunctionInterfaceEx2 {

    public static void main(String[] args) {

        Function<String, String> toUppercase = str -> str.toUpperCase();

        String result = toUppercase.apply("hello");

        System.out.println("Uppercase: " + result);

    }
}
