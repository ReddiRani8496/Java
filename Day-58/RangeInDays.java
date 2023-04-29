import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RangeInDays {
    public static void main(String[] args) {
        
        LocalDate date1 = LocalDate.of(2023, 1, 1);

        var numberOfDays = ChronoUnit.DAYS.between(date1, LocalDate.now());

        System.out.println(numberOfDays);
    }
}
