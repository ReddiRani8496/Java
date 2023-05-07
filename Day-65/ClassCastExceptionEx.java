public class ClassCastExceptionEx {
    
    public static void main(String[] args) {
        
        Car c = new Car();

        Audi a = new Audi();

        Car x1 = (Car) a; // we can typecast child object to parent type

        System.out.println("car"); 

      //  Audi x = (Audi) c; // throws ClassCastException, since we are trying to typecast parent object to child type


    }
}

class Car {

}

class Audi extends Car {

}
