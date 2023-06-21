/*
 * Refactoring code:
 * ----------------
 * 
 * Changing the structure of the code without changing the behaviour
 */
import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalc {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public static void main(String[] args) {

        int principal = (int) readInput("Principal",1000,1000000000);

        float annualRate = (float) readInput("Annual Interest",1,48);
        float monthlyRate = getMonthlyRate(annualRate);

        byte years = (byte) readInput("Time frame (in years)",1,30);
        short noOfPayments = getNumOfPayments(years);

        double mortgage = findMortgage(principal,monthlyRate,noOfPayments);

        String formatedMonthlyAmount = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Monthly Amount:"+formatedMonthlyAmount);


    }
    public static double readInput(String prompt,int min,int max) {

        Scanner sc = new Scanner(System.in);

        double value;

        while (true) {

            System.out.print(prompt + " : ");

            value = sc.nextDouble();

            if (value >= min && value <= max)

                break;

            System.out.println("Enter the value between "+min+" and "+max);

        }



        return value;

    }
    public static float getMonthlyRate(float annualRate) {
        float monthlyRate = annualRate/PERCENT/MONTHS_IN_YEAR;
        return monthlyRate;
    }
    public static short getNumOfPayments(byte years) {
        return (short) (years * MONTHS_IN_YEAR);
    }
    public static double findMortgage(int principal,float monthlyRate, short noOfPayments) {
        double mortgage = principal *(monthlyRate * Math.pow((1+monthlyRate),noOfPayments))/
                (Math.pow((1+monthlyRate),noOfPayments)-1);
        return mortgage;
    }
}