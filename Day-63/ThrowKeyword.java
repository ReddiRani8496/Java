public class ThrowKeyword {

    static void fun() {

        try {

            throw new ArithmeticException("demo"); // explicitly throwing the exception
        }
        catch(ArithmeticException e) {

            System.out.println("Caught inside fun()");

            throw e; // throw exception in main method
        }
    }
    
    public static void main(String[] args) {
        
        try {
            fun();
        }
        catch(ArithmeticException e) {

            System.out.println("caught in main");
        }
    }
}
