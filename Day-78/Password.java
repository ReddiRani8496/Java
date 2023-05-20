import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void  main(String[] args) {

        Pattern p1 = Pattern.compile("password");

        Scanner sc = new Scanner(System.in);

        Matcher matcher;

        int count = 0;

        do {

            System.out.println("Enter your password: ");

            String pass = sc.next();

            matcher = p1.matcher(pass);

            if(matcher.matches()) {

                System.out.println("You entered correct password");

                break;
            }
            else if(count == 5) {

                System.out.println("Timed out, wait for 30 seconds and try again");

             try {

                 Thread.sleep(3000);

             } catch (InterruptedException e) {

                 throw new RuntimeException(e);
             }

             count = 0;

            }
            else {
             
                System.out.println("You entered wrong password try again, "+(5-count)+" chances left");
             
                count++;
            }

        }while(!matcher.matches());

    }
}


