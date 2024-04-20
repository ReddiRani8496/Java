package DateTimeAPI;
import java.text.*;

public class DecimalFormatEx {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("$#,###.##");

        double salary = 1000000.343;

        System.out.println(df.format(salary));

    }
    
}
