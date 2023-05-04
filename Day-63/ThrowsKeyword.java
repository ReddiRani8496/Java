public class ThrowsKeyword {

    public static void main(String[] args) {
        
        try {
            div(2, 0);
        }
        catch(Exception e) {
            System.out.println("exception handled in main");
        }
    }

    static int div(int c, int d) throws ArithmeticException {
        int r = divide(c,d);
        return 10;
    }

    static int divide(int a, int b) throws ArithmeticException{
            if(b==0)
                throw new ArithmeticException("/by zero");
            return a/b;
    }
    
}
