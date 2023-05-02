// The error occured during compile time and detected by the compiler is called runtime exception.

public class CompileTimeException {
    public static void main(String[] args) {
        
        int age = "ten"; // compile time exception, string cannot be stored in int

        System.out.println(age);
    }
}
