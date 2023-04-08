package vehicle;

public class Car {
    public int doors;
  int speed;
    String color;
   public void setDoors(int d){ //if method is not public we cannot access from another package
        this.doors=d;
    }
   public int getDoors(){
        return doors;
    } 
    public void run(){
        System.out.println("car is running ");
    }
    
}
class Bike{
    static private String model="ktm"; //we can access in same class, i.e. bike
    private String color="orange"; //we cannot access it directly, since it is non static, we have to create method inside the main method
    public static void main(String[] args) {
       Car c=new Car();
       c.speed=100; //default variable speed can be accessed within the same package
       System.out.println(c.speed);
       System.out.println(model);
       Bike b=new Bike();
       System.out.println(b.color);
    }
}
