package DateTimeAPI;

import java.time.Duration;
import java.time.LocalTime;

public class CaluculatingDuriation {
    public static void checkingDuration() {
        LocalTime time1 = LocalTime.now();
        System.out.println("the current time is " + time1);
        Duration fiveHours = Duration.ofHours(5);
        LocalTime time2 = time1.plus(fiveHours);
        System.out.println("after adding five hours " + "of duration " + time2);
        Duration gap = Duration.between(time2, time1);
        System.out.println("duration gap between time1" + " & time2 is " + gap);
    }
    public static void main(String[] args) {
        
        checkingDuration();
    }
}
