// program to display the minimum and maximum days and weeks in a year

import java.util.*;

public class CalendarMaxMin {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);

        System.out.println("Maximum number of days in a week: " + max);

        max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        
        System.out.println("Maximum number of weeks in a year: " + max);

        int min = calendar.getMinimum(Calendar.DAY_OF_WEEK);

        System.out.println("Minimum number of days in a week: "+min);

        min = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        
        System.out.println("Minimum number of weeks in a year: "+min);
    }
}
