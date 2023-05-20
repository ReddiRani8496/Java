import java.util.Scanner;
import java.util.regex.Pattern;

public class PANMatching {
    public static void  main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        String regex = "[A-Z]{3}[PFCHAT][A-Z]{1}[\\d]{4}[A-Z]";
        int count = 0;
        boolean res;
        int wait = 1000;
        do {

            System.out.println("Enter your PAN number : ");
            String input = sc.next();
            res = Pattern.matches(regex,input);

            if(res)
                System.out.println("Your pan card number found");
                
            else {
                System.out.println("Please enter a valid pan number");
                count++;
                if(count >= 5) {
                    int time = wait/1000;
                    int time1 = time;
                    for(int i = 0; i < time; i++) {
                        System.out.println("Try again in "+time1+" seconds");
                        time1--;
                        Thread.sleep(time);
                    }
                    wait *= 2;
                }
            }

        } while(!res);
        
        sc.close();
    }
}



