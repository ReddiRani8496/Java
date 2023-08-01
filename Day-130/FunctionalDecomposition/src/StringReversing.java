public class StringReversing {

    public static String reverseString(String input) {

        StringBuilder reversed = new StringBuilder(input).reverse();
        return reversed.toString();
        
    }

    public static void main(String[] args) {

        String text = "Hello, Functional Decomposition!";

        System.out.println("Reversed: " + reverseString(text));

    }
}
