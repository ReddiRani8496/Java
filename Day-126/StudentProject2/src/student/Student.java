package student;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {

    private int rollNum;
    private String studentName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMarks;

    static Scanner scan = new Scanner(System.in);

   public Student() {

        rollNum = isRollNumValid();
        studentName = isNameValid();
        mark1 = isMarksValid(1);
        mark2 = isMarksValid(2);
        mark3 = isMarksValid(3);

    }

    private static int isRollNumValid() {

        int rollNo;

        while (true) {

            try {

                System.out.print("Enter student roll number: ");
                rollNo = scan.nextInt();

                if (rollNo > 0 && rollNo <= 100) {
                    break;
                }

                System.out.println("Enter valid roll number");

            } catch (Exception e) {

                System.out.println("Enter valid roll number");

                scan.next();

            }
        }

        return rollNo;

    }

    private static String isNameValid() {

        String name;
        boolean res;

        while (true) {
            System.out.print("\nEnter Student name: ");

            try {

                name = scan.next();

                res = Pattern.matches("[a-zA-Z][A-Za-z\s]{2,20}", name);

                if(res) {

                    break;

                };

            } catch (Exception e) {

                System.out.println("Enter a valid name");

                scan.next();

            }
        }

        return name;

    }

    private static int isMarksValid(int i) {

        boolean flag = false;
        int marks;

        while (true) {

            try {
                System.out.print("Enter marks"+i+": ");
                marks = scan.nextInt();

                if (marks > 0 && marks <= 100) {

                    flag = true;
                    break;
                }

                System.out.println("Enter valid marks");

            } catch (Exception e) {

                System.out.println("Enter valid marks");

                scan.next();

            }
        }

        return marks;

    }

    public int calculateTotal() {

        totalMarks = mark1 + mark2 + mark3;

        return totalMarks;

    }

    public void displayStudentDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", studentName='" + studentName + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2 +
                ", mark3=" + mark3 +
                ", totalMarks=" + calculateTotal() +
                '}';
    }
}



