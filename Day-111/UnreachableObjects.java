public class UnreachableObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1 = null; // s1 is called unreachable object, eligible for garbage collection
    }
}
class Student {
    int rollno;
    String name;
}
