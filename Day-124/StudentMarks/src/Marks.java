import java.util.InputMismatchException;
import java.util.Scanner;

public class Marks {

    private int marks1;
    private int marks2;
    private int marks3;

    Marks() {

        marks1 = 0;
        marks2 = 0;
        marks3 = 0;

    }

    static Scanner scan = new Scanner(System.in);



    public void in() {

        readMarks("Marks1");
        readMarks("Marks2");
        readMarks("Marks3");

    }

        private void readMarks(String subject) {

        while (true) {

            try {

                System.out.print("Enter " + subject + ": ");
                int marks = scan.nextInt();

                if (marks >= 0 && marks <= 100) {

                    if (subject.equals("Marks1"))
                        marks1 = marks;

                    else if (subject.equals("Marks2"))
                        marks2 = marks;

                    else if (subject.equals("Marks3"))
                        marks3 = marks;

                    break;
                }

                System.out.println("Enter marks between 0 to 100");

            } catch (InputMismatchException e) {

                System.out.println("Enter an integer number for marks");

                scan.next();

            }
        }

    }

    public int sum() {

       int sumOfMarks = marks1 + marks2 + marks3;

       return  sumOfMarks;

    }

    public String avg() {

        double average = (double) (sum()) / 3;

        return formatNumber(average);

    }

    private static String formatNumber(double number) {

        String str = String.valueOf(number);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '.') {

                for (int j = i + 1; j < str.length(); j++) {

                    char digit = str.charAt(j);

                    if (digit != '0') {
                        count++;
                        break;
                    }

                }
            }
        }

        if (count == 0) {

            return String.valueOf((int) number);

        } else {

            return String.valueOf(String.format("%.2f", number));

        }

    }
}
