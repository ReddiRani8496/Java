//program to access the protected variable from same package non-subclass.
package pack2;

public class College {
    public static void main(String[] args) {
       Student s=new Student();
       s.name="john";
       s.rollNo=1;
       s.course="MCA";
       System.out.println("Name="+s.name);
       System.out.println("rollno="+s.rollNo);
       System.out.println("course="+s.course);

    }
}
class Student{
  protected  String name;
  protected  int rollNo;
   protected String course;
}
