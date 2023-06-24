import java.util.Stack;

public class MethodEx {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age=28;
        p1.name="john";
        System.out.println(p1);
        p1 = new Person();

    }
    static void rock(){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
    }
}
class Person {
    int age;
    String name;
}
