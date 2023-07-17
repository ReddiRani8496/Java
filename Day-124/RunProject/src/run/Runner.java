package run;

public class Runner {
    static String longestRunner;
    static double longestDistance;
    String name;
    double distance;

    public void setName(String name) {
        this.name = name;
    }
    public void setDistance(double distance) {
        this.distance = distance;
        if(distance>longestDistance) {
            longestDistance = distance;
            longestRunner = name;
        }
    }
    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Run{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }

    public static String getLongestRunner() {
        return longestRunner;
    }
}
