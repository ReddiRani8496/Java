package student;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Student {

    private static int uniqueNumbers;
    private int rollNumber;
    private String name;
    private int[] marks = new int[5];

    static Scanner scan = new Scanner(System.in);

    public Student() {

        uniqueNumbers++;
        this.rollNumber = uniqueNumbers;

    }

    public void input() {

        name = isNameValid();

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter student "+(i+1)+" marks: ");
            marks[i] = isMarksValid();

        }

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
    private static int isMarksValid() {

        boolean flag = false;
        int marks;

        while (true) {

            try {

                marks = scan.nextInt();

                if (marks > 0 && marks <= 100) {

                    flag = true;
                    break;
                }

                System.out.println("Enter valid GPA");

            } catch (Exception e) {

                System.out.println("Enter valid GPA");

                scan.next();

            }
        }

        return marks;

    }

    public void show() {

        System.out.println(this);

    }


    public static void totalStudents() {

        System.out.println("Total students registered: "+ uniqueNumbers);

    }

    public int totalMarks() {

        int totalMarks =0;

        for (int i = 0; i < 5; i++) {
            totalMarks += marks[i];
        }

        return totalMarks;
    }

    public int getHighest() {

        int highestMarks = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > highestMarks)
                highestMarks = marks[i];

        }

        return highestMarks;

    }

    public int getLowest() {

        int lowestMarks = marks[0];

        for (int i = 0; i < marks.length; i++) {

            if(marks[i]<lowestMarks)
                lowestMarks = marks[i];

        }

        return lowestMarks;
    }

    public double getAverage() {

        return (double) totalMarks() /5;

    }

    public int getPassCount() {

        int passCount = 0;

        for (int i = 0; i < 5; i++) {

            if(marks[i]>=50)
                passCount++;

        }

        return passCount;
    }
    @Override
    public String toString() {

        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ", Total Marks: " + totalMarks() +
                ", Highest Marks: " + getHighest() +
                ", Lowest Marks: " + getLowest() +
                ", Average Marks: " + getAverage() +
                ", Number of subjects passed: " + getPassCount()+" /5" +
                '}';

    }

}


/*
Create a class Student that contains following data members:

static variable to create unique numbers

A variable to store roll number
A variable to store name of student
An array to store marks of 5 subjects
This class should have following member functions:

A constructor with no-parameters that increments static variable and assign it to roll
number. Remaining data members should be initialized to zero or empty values.
Input() function to input name and marks of 5 subjects from user
Show() function to display roll number, name and marks of 5 subjects to the user
TotalStudents() function that should display the number of objects that has been
created so far. This function should be static.
TotalMarks() function that should calculate and return to total marks of a student
getHighest() function that returns highest marks of the student
getLowest() function that returns lowest marks of the student
getAverage() function that returns average marks of student
getPassCount() function that counts and returns total number of subjects in which the
student is passed. (A student is passed if he gets 50% or above marks)
In main function, create three objects, input their values and display them. For each student, display
his total marks, highest, lowest, average marks and the number of subjects in which he is passed. Also
display how many students have been registered so far.
 */
