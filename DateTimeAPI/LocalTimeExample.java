import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("Present time : " + now);

        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        System.out.println("Hour : " + hour + " , Minute : " + minute + ", Second : " + second);

        int nanoSec = now.getNano();

        System.out.println("time now in format : " + hour + ":" + minute + ":0" + second + ":" + nanoSec);

        LocalTime oldTime = LocalTime.of(13, 20, 25);
        System.out.println("Old time : " + oldTime);

    }

}
