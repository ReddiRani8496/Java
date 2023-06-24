public class ReassigningRefVar {

    public static void main(String[] args) {

        Student1 s1 = new Student1();

        Student1 s2 = new Student1();

        s2 = s1; // eligible for garbage collection, since reassigning the reference variable
                 // the object for s2 in the heap memory  destroyed after assigning s1 object to s2

    }
}
class Student1 {
    int rollno;
    String name;
}
