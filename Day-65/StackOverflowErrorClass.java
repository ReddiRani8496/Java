public class StackOverflowErrorClass {
    
    static int i = 0;

    public static int printNumber (int x) {
        
        i = i + 2;

      //  System.out.println(i); throws StackOverflowError

        if(i == 8)

            return i;

        return i + printNumber(i+2);
    }
    public static void main(String[] args) {

       System.out.println(StackOverflowErrorClass.printNumber(i));

    }
}
