import java.util.Scanner;
import java.util.regex.Pattern;;
public class ConstantNameValid {
    public static void  main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String regex = "[A-Z]{1}[A-Z_]*";
        boolean res;
        do {
        
            System.out.println("Enter constant name : ");

            String input = sc.next();

            res = Pattern.matches(regex,input);

            if(res)

                System.out.println("constant name valid");

             else

                System.out.println("Invalid, constant name must be combonation of A-Z and underscore");
                
        }while(!res);
        
        sc.close(); 
}
}
