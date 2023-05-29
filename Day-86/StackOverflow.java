/*
 * Stack Overflow is an error which occurs simply when you try to push new data onto to a full stack.
 * This is such a common error when making complicated algorithms that use recursion on that
 * they have named a website after it.
 */
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
