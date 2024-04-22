import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Present date : " + now);

        int year = now.getYear();
        Month month = now.getMonth();
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        System.out.println("year : " + year + " , month : " + month + ", day : " + day + "Hour : " + hour
                + " , Minute : " + minute + ", Second : " + second);

        LocalDateTime oldDate = LocalDateTime.of(1990, 12, 10, 10, 10, 10);
        System.out.println("Old date : " + oldDate);

        LocalDate newlocalDate = now.toLocalDate();
        System.out.println("newlocalDate : " + newlocalDate);

        LocalTime newlocalTime = now.toLocalTime();
        System.out.println("newlocalTime : " + newlocalTime);

        LocalDateTime strToDate = LocalDateTime.parse("2019-10-10T10:10:10");
        System.out.println("String to Date : " + strToDate);
    }
}
