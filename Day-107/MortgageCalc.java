import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalc {

    public static void main(String[] args) {

        final  byte MONTHS_IN_YEAR = 12;
        final  byte PERCENT = 100;

        int principal = (int) readInput("Principal",1000,1000000000);

        float annualRate = (float) readInput("Annual Interest",1,48);
        float monthlyRate = annualRate/PERCENT/MONTHS_IN_YEAR;

        byte years = (byte) readInput("Time frame (in years)",1,30);
        short noOfPayments = (short) (years * MONTHS_IN_YEAR);

        double mortgage = principal *(monthlyRate * Math.pow((1+monthlyRate),noOfPayments))/ (Math.pow((1+monthlyRate),noOfPayments)-1);

        String formatedMonthlyAmount = NumberFormat.getInstance().format(mortgage);

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

          sc.close();
        
        return value;
      
    }
}