import java.util.Stack;

public class StackUnderflow {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10); // adding the elements into the stack

        stack.push(20);

        stack.push(30);

        System.out.println(stack);

        stack.pop(); // removing the elements from the stack

        stack.pop();

        stack.pop();

        System.out.println(stack); // empty stack will be returned

        stack.pop(); // it will throw EmptyStackException

       
    }    
}
