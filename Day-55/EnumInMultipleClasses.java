enum Days {
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN
}
public class EnumInMultipleClasses {
    public static void main(String[] args) {

        Days day = Days.FRI;

        System.out.println(day);
    }
}
class PrintDay{

       Days day = Days.SUN;
    
}

