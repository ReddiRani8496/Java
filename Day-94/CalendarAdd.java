import java.util.*;

public class CalendarAdd {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DATE, -20);

        System.out.println("20 days ago: " + calendar.getTime());

        calendar.add(Calendar.MONTH, 3);

        System.out.println("3 months later: " + calendar.getTime());

        calendar.add(Calendar.YEAR, 5);

        System.out.println("5 years later: " + calendar.getTime());
        
    }
}
