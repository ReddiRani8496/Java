// program to check whether the user entered correct aadhar number or not using regular expression.
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AadharMatching {
    public static void main(String[] args) {

        Pattern aadhar = Pattern.compile("............");

        Scanner sc = new Scanner(System.in);

        boolean b1;

        Matcher matcher;

        do {

            System.out.println("Enter your aadhar number: ");

            String aadharNum = sc.next();

             b1 = Pattern.matches("[0-9]{12}",aadharNum);

            matcher = aadhar.matcher(aadharNum);
            
            if(!matcher.matches()) {

                System.out.println("The aadhar number must contain 12 digits, try again");
            }
            else {

                if(b1) {

                    System.out.println("Finally you entered a right number");

                    break;
                }
                else {
                    System.out.println("Enter valid aadhar number");
                }
            }

        } while (!b1);

        sc.close();
    }
}


