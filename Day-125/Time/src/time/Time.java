package time;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(){

        hours = minutes = seconds = 0;

    }
    
    public Time(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        simplify(seconds);

    }

        public void simplify(int seconds){

        if(seconds > 59){
            this.seconds = seconds%60;
            this.minutes += seconds/60;
        }

        if(minutes > 59) {
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }

        if(this.hours>11) {
            this.hours = this.hours % 12;
        }

    }
    public void  display() {

        String formatedTime = getFormatedTime();
        System.out.println(formatedTime);

    }

    public  String getFormatedTime() {

        String hour = String.format("%02d", hours);
        String minute = String.format("%02d", minutes);
        String second = String.format("%02d", seconds);

        return hour+":"+minute+":"+second;

    }

    public static Time addTwoTimes(Time t1, Time t2) {

        int totalHours = t1.hours+t2.hours;
        int totalSeconds = t1.seconds+t2.seconds;
        int totalMinutes = t1.minutes+t2.minutes;

        Time t3 = new Time(totalHours,totalMinutes,totalSeconds);
        return t3;

    }
}
