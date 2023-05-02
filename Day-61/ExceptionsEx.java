import java.util.Scanner;
public class ExceptionsEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        try {
            int age = sc.nextInt();
            System.out.println(age);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Name: Rock");
        sc.close();
    }
}
