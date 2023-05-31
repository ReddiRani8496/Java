import java.util.Arrays;

public class Cats {

    private String name;
    private double speed;
    private House[] house;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    void meow() {
        System.out.println("meow meow");
    }

    public House[] getHouse() {
        return house;
    }

    public void setHouse(House[] house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", house=" + Arrays.toString(house) +
                '}';
    }
}
