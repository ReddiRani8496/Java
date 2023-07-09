import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = scan.nextDouble();
        System.out.print("Enter second number: ");
        double second = scan.nextDouble();
        System.out.print("Enter operation (+, -, *, /, %, ^): ");
        char operation = scan.next().charAt(0);
        double result=0;
        switch(operation) {

            case '+' : result = first + second;
                        break;

             case '-' : result = first - second;
                        break;

             case '*' : result = first * second;
                        break;

             case '/' : result = first/second;
                        break;

             case '%' : result = first%second;
                        break;

             case '^' : result = Math.pow(first, second);
                        break;
                        
            default : System.out.println("Invalid operation");
        }
        System.out.println(first+" "+operation+" "+second+" = "+result);
        scan.close();
    }
}