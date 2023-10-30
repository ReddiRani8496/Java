public class Constructors {
    public static void main(String[] args) {
       // Eagle eagle = new Eagle();
       // eagle.fly(); // error, there is no default constructor in parent class
        Parrot parrot = new Parrot(); // 10 hello parrot
     //   Parrot p1 =(Parrot) new Eagle(); // throws class cast exception, cannot type cast parent to child
        Eagle eagle =(Eagle) new Parrot(); // no exception
    }
}

abstract class Vehicle {
  //  abstract static void drive(); // cannot make abstract methods as static
    abstract void drive();
}

class car extends Vehicle {
    void drive() {
        System.out.println("Car driving");
    }
}

class Bird {
    Bird(int age){
        System.out.println(10);
    }
    int speed = 200;

}
class Eagle extends Bird{

    /*
    when object is created, default constructor is created
    Eagle(){
        super(); // calls the parent class constructor with no arguments, but parent class not contains default constructor
     }
     */

    Eagle() {
        super(10); // there is no error explicitly calling one parameterised constructor
        System.out.println("hello");
       // super(20); // super call must be first statement in the constructor body
    }
    public void fly() {
        System.out.println("Flying speed "+speed); // child can access parent variables
    }
    
}

class Parrot extends Eagle {
    Parrot() {
        System.out.println("Parrot");
    }
}
