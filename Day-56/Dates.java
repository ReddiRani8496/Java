import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now(); //to display current date

        System.out.println(date);

        LocalTime time = LocalTime.now(); //to dispaly current time

        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now(); //displaying current date and time
        
        System.out.println(dateTime);

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        dateTime.format(d);

        System.out.println(dateTime);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        dateTime.format(format1);

        System.out.println(dateTime);

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");

        dateTime.format(format2);

        System.out.println(dateTime);
    }
}
