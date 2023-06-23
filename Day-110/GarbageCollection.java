public class GarbageCollection {
    public static void main(String[] args) {
        
        Student s1 = new Student(1, "john");
        s1.get();

        Student s2 = new Student(2, "king");
        s2.get();

        Student s3 = new Student(3, "David");
        s3.get();

        s3 = s2; // s3 point to s2 object. It is not possible to point s3 object once it is assigned to another object, we dont't the address of that object
        s3.get();

    }
}
class Student{

    int rollno;
    String name;

    Student(int rollno,String name) {

        this.rollno=rollno;
        this.name=name;

    }
    public void get() {

        System.out.println("rollno: "+rollno);
        System.out.println("name: "+name);

    }
}
