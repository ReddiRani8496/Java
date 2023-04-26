enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}
public class EnumInLoop {
    public static void main(String[] args) {

      for(var month : Month.values())
      
        System.out.println(month);  
    }
}
