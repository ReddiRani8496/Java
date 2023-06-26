public class SealedUsingAbstract {
    public static void main(String[] args) {
        Car car = new Car();
        car.print();
        Raven raven = new Raven();
        raven.print();
    }
}
sealed abstract class Vehicle permits Car,Bike {
    void print() {
        System.out.println("It is a vehicle");
    }
}
non-sealed class Car extends Vehicle {
    @Override
    void print() {
        System.out.println("It is a car");
    }
}
sealed abstract class Bike extends Vehicle {

}
final class Raven extends Bike {
    void print() {
        System.out.println("It is a bike");
    }
}
