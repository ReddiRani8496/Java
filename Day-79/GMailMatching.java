import java.util.Scanner;
import java.util.regex.Pattern;

public class GMailMatching {
    public static void  main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        String gmail = "^\\D[0-9a-z]{5,29}@[a-z]{3,10}[.][a-z]{2,3}";
        int count = 0;
        boolean res;
        int wait = 1000;
        do {

            System.out.println("Enter your gmail account : ");
            String input = sc.next();
            res = Pattern.matches(gmail,input);

            if(res)
                System.out.println("You are loged in");

            else {
                System.out.println("Please enter a valid gmail");
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



