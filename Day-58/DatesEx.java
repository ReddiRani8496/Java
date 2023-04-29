import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatesEx {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime kingJoiningDateTime = LocalDateTime.of(2022, 6, 6, 10, 15, 38);
        System.out.println(kingJoiningDateTime);
        LocalDateTime johnJoiningDateTime = LocalDateTime.of(2021, 9, 1, 10, 30, 12);
        System.out.println(johnJoiningDateTime);
        var res = kingJoiningDateTime.isAfter(johnJoiningDateTime);
        System.out.println(res);
        var res1 = kingJoiningDateTime.isBefore(johnJoiningDateTime);
        System.out.println(res1);
        var res2 = kingJoiningDateTime.isEqual(johnJoiningDateTime);
        System.out.println(res2);
        var res3 = kingJoiningDateTime.compareTo(johnJoiningDateTime);
        System.out.println(res3);
        var zone = LocalDateTime.now(ZoneId.systemDefault());
        System.out.println(zone);
        for(String zones : ZoneId.getAvailableZoneIds())
            System.out.println(zones);
        System.out.println(LocalDateTime.now(ZoneId.of("America/Campo_Grande")));
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now());
        System.out.println(LocalDateTime.now().getDayOfMonth());
        System.out.println(LocalDateTime.now().getDayOfYear());
        System.out.println(LocalDateTime.now().getHour());
        System.out.println(LocalDateTime.now().getMinute());
        System.out.println(LocalDateTime.now().getSecond());
        System.out.println(LocalDateTime.now().getYear());
    }    
}
