import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatEx {

    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        int amount = 30000;
        System.out.println(nf.format(amount));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
         amount = 50000;
        System.out.println(nf1.format(amount)); // prints the currency with china currency symbol

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf2.format(amount)); // prints the currency with US currency symbol

        for(var x : NumberFormat.getAvailableLocales())
            System.out.println(x); // prints all available locales

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        System.out.println(nf3.format(amount));
        amount = 20000;
        String res = nf3.format(amount);// format method returns string
        System.out.println(res);

        for(var x : Currency.getAvailableCurrencies()) // returns all available currencies in java
            System.out.println(x);

        String result = NumberFormat.getPercentInstance().format(1); // returns percentage
        System.out.println(result);

        String result1 = NumberFormat.getPercentInstance().format(0.1); // returns(100*0.1=10)
        System.out.println(result1);
    }
}
