public class NumberFormatExceptionEx {

    public static void main(String[] args) {
        
        System.out.println("welcome");
        
        String str = "hello";

        int x = Integer.parseInt(str); // String can not be stored in integer and throws NumberFormatException

        System.out.println(x);

    }
}
