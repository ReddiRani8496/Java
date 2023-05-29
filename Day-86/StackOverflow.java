public class StackOverflow {

    static void number() {

        System.out.println(10);

        prime();
    }
    static void prime() {

        System.out.println(2);

        number();
    }
    public static void main(String[] args) {
        
        number(); // throws the stack overflow exception
        
    }
}
