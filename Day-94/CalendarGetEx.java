import java.util.*;

public class CalendarGetEx {

    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();

        System.out.println("Year:"+calendar.get(Calendar.YEAR));

        System.out.println("Date:"+ calendar.get(Calendar.DATE));

        System.out.println("Minutes:"+calendar.get(Calendar.MINUTE));

        System.out.println("Second:"+calendar.get(Calendar.SECOND));
    }
}