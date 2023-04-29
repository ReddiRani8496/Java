import java.time.LocalDate;
import java.time.Period;
public class DaysMonthsPassed {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate independenceDate = LocalDate.of(1947,8, 15);

        Period period = Period.between(today, independenceDate);

        System.out.println(period);
    }
}
