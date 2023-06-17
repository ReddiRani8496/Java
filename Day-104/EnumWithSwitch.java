public class EnumWithSwitch {

    public static void main(String[] args) {
        Days d;

        d=Days.MONDAY;

        switch (d) {

            case SUNDAY -> System.out.println("sunday");

            case MONDAY -> System.out.println("monday");

            case TUESDAY -> System.out.println("tuesday");

            case WEDNESDAY -> System.out.println("wednesday");

            case THURSDAY -> System.out.println("thursday");

            case FRIDAY -> System.out.println("friday");

            case SATURDAY -> System.out.println("saturday");
        }


    }
}
enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
