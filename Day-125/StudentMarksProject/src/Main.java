import student.Student;

public class Main {

    public static void main(String[] args) {

        Student student[] = new Student[3];

        for (int i = 0; i < 3; i++) {

            student[i] = new Student();
            student[i].input();

        }

        for (int i = 0; i < 3; i++) {

            student[i].show();

        }

        Student.totalStudents();

    }
}

/*
In main function, create three objects, input their values and display them. For each student, display
his total marks, highest, lowest, average marks and the number of subjects in which he is passed. Also
display how many students have been registered so far.
 */