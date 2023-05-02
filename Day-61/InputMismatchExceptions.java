import java.util.Scanner;

public class InputMismatchExceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt(); // input: ten -> throws inputMismatchException

        System.out.println(age);
        
        sc.close();
    }
}
