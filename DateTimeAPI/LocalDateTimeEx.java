package DateTimeAPI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
    LocalDateTime myDateObj = LocalDateTime.now();

DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

String formattedDate = myDateObj.format(myFormatObj);
System.out.println(formattedDate);
}
