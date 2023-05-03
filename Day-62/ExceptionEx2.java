import java.util.Scanner;

public class ExceptionEx2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        try {
            int a=4/sc.nextInt(); // if exception caught next statement will not execute, try block will terminate 
            int age=sc.nextInt();
            System.out.println(arr[10]);
        }
        // don't use type of exception, sometimes some other exceptions might occur, better to use parent class "Exception"
      /*   catch(InputMismatchException e) {   //one try block contains multiple catch blocks.
            System.out.println("input mismatch");
        }
        catch(ArithmeticException e) {
            System.out.println("arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("give valid array index");
        }*/
        catch(Exception e){
            System.out.println("null");
        }
        System.out.println("hello");
    
    }
}
