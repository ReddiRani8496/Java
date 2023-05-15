import java.util.Stack;

public class PassingObjectToStack {
    public static void main(String[] args) {

        Stack<Student> stack = new Stack<>();

        Student s1 = new Student();

        s1.rno = 1;

        s1.name = "John";

        s1.college = "SV University";

        Student s2 = new Student();

        s2.rno = 2;

        s2.name = "King";

        s2.college = "SV University";

        stack.push(s1);

        stack.push(s2);
        
        System.out.println(stack);
    }
}

class Student {

    int rno;

    String name;

    String college;

    @Override
    public String toString() {
        
        return "rno: "+rno+" name: "+name+" college: "+college;
    }
}
