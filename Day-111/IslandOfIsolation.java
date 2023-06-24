public class IslandOfIsolation {
    public static void main(String[] args) {

        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.name = new Student3();
        System.out.println(s1.name.rollno);// island of isolation, object chaining is performing in heap
        s2 = null; // s2 object is not destroyed
        System.out.println(s1.name.rollno);
        s1.name.name = new Student3();
        s1.name.name.rollno = 10;
        System.out.println(s1.name.name);

    }
}
class Student3 {
    int rollno;
    Student3 name;

    @Override
    public String toString() {
        return "Student3{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
