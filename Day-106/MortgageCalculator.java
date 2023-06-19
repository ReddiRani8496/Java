import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final byte  MONTHS_IN_YEAR = 12;

        final byte PERCENT = 100;

        int principal = 0;

        float montlyRate = 0;

        short numberOfPayments;

        while (true) {

            try {

                System.out.println("Enter principal: ");

                principal = sc.nextInt();

                if(principal >= 1000 && principal <= 1000000000)
                     break;

                System.out.println("Enter amount between 1000 to 1000000000");

            } catch (InputMismatchException e) {

                System.out.println("Enter amount between 1000 to 1000000000");

                sc.next();

            }
        }

        while (true) {

            try {

                System.out.print("Annual interest rate : ");

                float yearlyRate = sc.nextFloat();

                if (yearlyRate >= 1 && yearlyRate <= 48) {

                    montlyRate = yearlyRate / PERCENT / MONTHS_IN_YEAR;

                    break;
                }

                    System.out.println("enter interest rate between 1 to 48 percent ");

            } catch (InputMismatchException e) {

                System.out.println("Enter interest rate between 1 to 48 percent ");

                sc.next();

            }
        }
        while (true) {

            try {

                System.out.print("Time frame (in years): ");

                byte years = sc.nextByte();

                if (years >= 1 && years <= 30) {

                    numberOfPayments = (short) (years * MONTHS_IN_YEAR);

                    break;

                }

                System.out.println("Enter time frame between 1 to 30 years");

            } catch (Exception e) {

                System.out.println("Enter time frame between 1 to 30 years");

                sc.next();

            }
        }

        double mortgage = principal * (montlyRate*Math.pow((1+montlyRate),numberOfPayments))/(Math.pow((1+montlyRate),numberOfPayments)-1);

        String formatedMonthlyAmount = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage monthly: "+formatedMonthlyAmount);
    }
}