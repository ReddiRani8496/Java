@BasicEngine(mileage = "20",fuelType = "Diesel")
public class Car {
    String model;
    public Car(String model){
        this.model = model;
    }
    Car(){

    }
    public  void getCarDetails(){
        System.out.println(model);
    }
}
