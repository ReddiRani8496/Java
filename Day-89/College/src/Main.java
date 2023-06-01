import department.Department;
import department.DeptName;
import library.Books;
import library.Fiction;
import library.NonFiction;
import staff.teaching.STAFFSUBJECT;
import staff.teaching.Teaching;
import students.Gender;
import students.Student;

public class Main {

    public static void main(String[] args) {
        
        Department department = new Department();
        department.setDeptName(DeptName.MCA);

        Teaching teaching = new Teaching();
        teaching.setName("john");
        teaching.setStaffsubject(STAFFSUBJECT.MATHS);

        Student student = new Student();
        student.setStudentName("king");
        student.setRollNumber(34);
        student.setGender(Gender.MALE);

        Books books = new Books();
        books.setFiction(Fiction.HUMOUR);
        books.setNonFiction(NonFiction.MAGAZINES);

        System.out.println(department);
        System.out.println(teaching);
        System.out.println(student);
        System.out.println(books);

    }
}