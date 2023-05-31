package grocery.healthdrinks;

import grocery.Grocery;

public class Boost extends Grocery {
    private double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Boost{" +
                "calories=" + calories +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", gms=" + gms +
                '}';
    }
    public  Boost(){
        System.out.println("Boost is the secret of my energy..");
    }
}
