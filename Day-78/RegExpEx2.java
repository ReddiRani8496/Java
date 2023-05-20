// program to check whether the user entered correct aadhar number or not using regural expression.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpEx2 {
    public static void main(String[] args) {

        Pattern aadhar = Pattern.compile("............");

        Scanner sc = new Scanner(System.in);

        Matcher matcher;

        do {

            System.out.println("Enter your aadhar number: ");

            String aadharNum = sc.next();

            if(aadharNum.length() < 12 || aadharNum.length() > 12) {

                System.out.println("The aadhar number must contain 12 digits, try again");
            }

            matcher = aadhar.matcher(aadharNum);

        } while (!matcher.matches());

        System.out.println("Finally you entered a right number");

        sc.close();
    }
}


