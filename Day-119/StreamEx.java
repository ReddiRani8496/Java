import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<Student> list = Data.getStudentList();
        list.stream().limit(3).forEach(System.out::println);
        Stream.of(1,2,3,4,5).map(e->e*11).forEach(System.out::println);
        Stream.of("hi","hello").map(e->e.toUpperCase()).forEach(System.out::println);
        list.stream().limit(3).map(Student::name).forEach(System.out::println);
        list.stream().map(Student::branch).forEach(System.out::println);
        list.stream().filter(e->e.branch().equals("CSE")).mapToDouble(Student::roll);
        System.out.println(list.stream().filter(e->e.branch().equals("CSE")).mapToDouble(Student::roll).average());
        list.stream().limit(3).sorted(Comparator.comparingDouble(Student::fee)).forEach(System.out::println);
    }
}
record Student(int roll,String name,String branch,double fee){

}
class Data {
    public static List<Student> getStudentList() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"john","CSE",60000));
        list.add(new Student(2,"rahul","ECE",40000));
        list.add(new Student(3,"arjun","CIV",90000));
        list.add(new Student(4,"ram","EEE",25000));
        list.add(new Student(5,"gita","MEC",72000));
        list.add(new Student(6,"sita","CSE",15000));
        list.add(new Student(7,"warner","MEC",39000));
        list.add(new Student(8,"king","CSE",58000));
        list.add(new Student(9,"David","CIV",61000));
        return list;
    }
}
