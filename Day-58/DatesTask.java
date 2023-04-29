/* The Nebula-1 station receives spaceships only on odd days of the standard earth year (i.e. days when there have been an odd number of days
since the begining of the year).Let's find out if we can party on Nebula-1 today.
 Return true if the number of days since the begining of the year is odd, and otherwise return false.
 */

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class DatesTask {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 1, 1);

        var numberOfDays = ChronoUnit.DAYS.between(date1, LocalDate.now());

        if(numberOfDays%2 != 0)

            System.out.println("true");
        else

            System.out.println("false");
    
    }
}
