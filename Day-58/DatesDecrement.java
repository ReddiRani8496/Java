import java.time.LocalDate;

public class DatesDecrement {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();

        System.out.println(today.minusYears(2));

        System.out.println(today.minusMonths(1));

        System.out.println(today.minusWeeks(7));

        System.out.println(today.minusDays(4));
    }
}
