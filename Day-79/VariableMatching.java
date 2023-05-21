import java.util.Scanner;

import java.util.regex.Pattern;

public class VariableMatching {
    public static void  main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regex = "[^\\d@#!%^&*()][\\w$]*";

        boolean res;

        do {
        
            System.out.println("Enter variable name : ");

            String input = sc.next();

            res = Pattern.matches(regex,input);

            if(res)

                System.out.println("Variable name valid");

             else

                System.out.println("Invalid Variable name");
                
        }while(!res);
        
        sc.close();


       
        
        sc.close();

    }
}




