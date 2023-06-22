import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readInput("Principal",1000,1000000000);

        float annualRate = (float) readInput("Annual Interest Rate",1,48);
        float monthlyRate = getMonthlyRate(annualRate);

        byte years = (byte) readInput("Time (in years)",1,30);
        short noOfPayments = getNumOfPayments(years);

        double mortgage = findMortage(principal,monthlyRate,noOfPayments);
        String formattedMonthlyAmount = formatAmount(mortgage);
        System.out.println("Monthly Amount : "+formattedMonthlyAmount);

        printPaymentSchedule(noOfPayments,principal,monthlyRate);

    }

    public static String formatAmount(double amount) {
        return NumberFormat.getCurrencyInstance().format(amount);
    }

    public static double readInput(String prompt,int min,int max) {

        Scanner scan = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt+": ");
            value = scan.nextDouble();
            if(value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between "+min+" and "+max);
        }
        return value;
    }

    public static float getMonthlyRate(float annualRate) {
        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
        return monthlyRate;
    }

    public static short getNumOfPayments(byte years) {
        return (short) (years * MONTHS_IN_YEAR);
    }

    public static double findMortage(int principal,float monthlyRate,short noOfPayments) {
        return principal * (monthlyRate * Math.pow((1+monthlyRate),noOfPayments)) /
                (Math.pow((1+monthlyRate),noOfPayments)-1);
    }

    public static void printPaymentSchedule(short noOfPayments,int principal,float monthlyRate) {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------");
        for(short month=1;month<=noOfPayments;month++) {
            double balance = principal*
                            (Math.pow((1+monthlyRate),noOfPayments)
                            - Math.pow((1+monthlyRate),month))/
                            (Math.pow((1+monthlyRate),noOfPayments)-1);
            String formattedAmount = formatAmount(balance);
            System.out.println(formattedAmount);
        }

    }

}


