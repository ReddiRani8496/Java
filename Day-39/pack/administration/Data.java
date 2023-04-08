package administration;
import vehicle.*;
public class Data {
    public static void main(String[] args) {
        Car c=new Car();
        c.setDoors(4);
        System.out.println(c.getDoors());
        c.run();
        
    }
}
