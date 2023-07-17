package run;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Run {
    public String runnerName;
    public double distance;


   static Scanner scan = new Scanner(System.in);

    public String getRunnerName() {

        return runnerName;

    }

    public void get() {

        runnerName = isNameValid();

        distance = isDistanceValid();
    }
    private static String isNameValid() {

        String runnerName;
        boolean res;

        while (true) {
            System.out.print("\nEnter runner runnerName: ");

            try {

                runnerName = scan.next();

                res = Pattern.matches("[a-zA-Z][A-Za-z\s]{2,20}", runnerName);

                if(res) {

                    break;

                };

            } catch (Exception e) {

                System.out.println("Enter a valid runnerName");

                scan.next();

            }
        }

        return runnerName;

    }

    private static double isDistanceValid() {

        double distance;

        while (true) {

            try {

                System.out.print("Enter student Distance: ");
                distance = scan.nextDouble();

                if (distance > 0) {
                    break;
                }

                System.out.println("Enter valid Distance");

            } catch (Exception e) {

                System.out.println("Enter valid Distance");

                scan.next();

            }
        }

        return distance;

    }

    @Override
    public String toString() {

        return "Run{" +
                "name='" + runnerName + '\'' +
                ", distance=" + distance +
                '}';

    }

}

