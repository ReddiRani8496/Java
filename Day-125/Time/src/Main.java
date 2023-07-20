import time.Time;

public class Main {

    public static void main(String[] args) {

        Time time = new Time(11,58,30);
        time.display();

        Time time1 = Time.addTwoTimes(new Time(8,90,90),time);
        time1.display();

    }
}