import java.util.Scanner;

import java.util.regex.Pattern;

public class MethodNameValid {
    public static void  main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regex = "[^\\d][a-zA-Z0\\d_$]*";
        boolean res;
        do {
        
            System.out.println("Enter method name : ");

            String input = sc.next();

            res = Pattern.matches(regex,input);

            if(res)

                System.out.println("Method name valid");

             else

                System.out.println("Invalid method name");
                
        }while(!res);
        
        sc.close();

    }
}






