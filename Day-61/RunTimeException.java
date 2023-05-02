// In run time exception statments will execute until the exception occurs, ones exception occurs remaining statements will not execute

public class RunTimeException {
    public static void main(String[] args) {

        System.out.println("Welcome");

        System.out.println("java");

        int a = 10/0; 

        System.out.println(a);
        
        System.out.println("programming");
    }
}

/* output:
 * Welcome
 * java
 * Throws Arithmetic Exception (Exception at runtime)
 */
