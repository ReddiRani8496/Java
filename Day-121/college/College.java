public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRollno(1);
        student.setName("John");
        student.setAge(25);
        System.out.println(student.getRollno());
        System.out.println(student.getName());
        System.out.println(student.getAge());     
    }
}