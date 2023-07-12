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

        double result = 0;

        switch(operation) {

            case '+': result = first + second;
                break;

            case '-': result = first - second;
                break;

            case '*': result = first * second;
                break;

            case '/': result = first/second;
                break;

            case '%': result = first%second;
                break;

            case '^': result = Math.pow(first, second);
                break;

            default : System.out.println("Invalid operation");

        }

        formatString(first,operation,second,result);

        scan.close();

    }
    static void formatString(double first,char operation, double second,double result) {

        String First = String.valueOf(first);
        String Second = String.valueOf(second);
        String Result = String.valueOf(result);

        int count=0;

        for(int i=0;i<First.length();i++) {

            if(First.charAt(i)=='.') {

                for(int j=i+1;j<First.length();j++) {

                    String str = First.substring(j,j+1);

                    int num = Integer.parseInt(str);

                    if(num>0) {
                        count++;
                        break;
                    }
                }
            }

        }

        int number1;

        if(count==0) {

            number1 = (int) first;
            System.out.print((int)number1+" "+operation+" ");
        }
        else
            System.out.print(first+" "+operation+" ");



        int count1 = 0;

        for(int i=0;i<Second.length();i++) {

            if(Second.charAt(i)=='.') {

                for(int j=i+1;j<Second.length();j++) {

                    String str = Second.substring(j,j+1);

                    int num = Integer.parseInt(str);

                    if(num>0) {

                        count1++;

                        break;
                    }
                }
            }
        }

        int number2;

        if(count1==0) {

             number2 = (int) second;
             System.out.print((int)number2+" = ");

        }

        else
            System.out.print(second+" = ");



        int count2 = 0;

        for(int i=0;i<Result.length();i++) {

            if(Result.charAt(i)=='.') {

                for(int j=i+1;j<Result.length();j++) {

                    String str = Result.substring(j,j+1);
                    int num = Integer.parseInt(str);

                    if(num>0) {

                        count2++;

                        break;
                    }
                }
            }
        }

        int res;

        if(count2==0) {

            res = (int) result;
            System.out.print(res);

        }

        else
        System.out.print(result);

    }
}
