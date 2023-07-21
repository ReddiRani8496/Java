public class MultipleInheritance {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        vehicle.sound(); // here comes an ambiguity which class sound method has to call, to avoid this java doesn't support multiple inheritance

    }    
}

class Bike {

    void sound() {

        System.out.println("sound");

    }

}

class Car {

    void sound() {

        System.out.println("sound");

    }

}

class Vehicle extends Car,Bike {

}