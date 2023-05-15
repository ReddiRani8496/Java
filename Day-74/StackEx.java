import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10); // pushing the elements into stack

        stack.push(20);

        stack.push(30);

        stack.push(40);

        System.out.println(stack); // printing the stack elements

        System.out.println(stack.pop());  // Removing elements using pop() method

        System.out.println(stack.peek()); // Fetching the element at the head of the Stack

        System.out.println(stack.isEmpty()); //It returns true if nothing is on the top of the stack.else returns false.

        System.out.println(stack.search(10)); // It determines whether an object exists in the stack

        System.out.println(stack.capacity()); // Returns the current capacity 

        System.out.println(stack.size()); // Returns the number of components in stack 

        System.out.println(stack.elementAt(2)); // returns the element at specified position

        stack.removeElementAt(1); // removes the element at specified position

        System.out.println(stack);

        System.out.println(stack.firstElement()); // returns the first element of the stack

        System.out.println(stack.lastElement()); // returns the last element of the stack

        System.out.println(stack.get(0)); // returns the element at specified index
    }
}
