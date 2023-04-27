//every enum is internally implemented by using class

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
class Days {
    public static final String MONDAY = "MONDAY";
    public static final String TUESDAY = "TUESDAY";
    public static final String WEDNESDAY = "WEDNESDAY";
    public static final String THURSDAY = "THURSDAY";
    public static final String FRIDAY = "FRIDAY";
    public static final String SATRUDAY = "SATURDAY";
    public static final String SUNDAY = "SUNDAY";
}
public class EnumInternally {
    public static void main(String[] args) {

        var myDay = Days.THURSDAY;
        
        System.out.println(myDay);
    }
}
