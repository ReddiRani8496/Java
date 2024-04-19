package DateTimeAPI;

import java.util.Date;
import java.text.*;

public class FormatDateEx {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); // date and time displayed

        SimpleDateFormat sdf = new SimpleDateFormat("dd - MMMM - yyyy");
        System.out.println(sdf.format(date)); // formats the date in above mentioned pattern

        SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE, dd - MMMM - yyyy"); // EEEE for day of the week
        System.out.println(sdf1.format(date)); // formats the date in above mentioned pattern

    }
}
