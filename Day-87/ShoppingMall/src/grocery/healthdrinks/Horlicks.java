package grocery.healthdrinks;

import grocery.Grocery;

public class Horlicks extends Grocery {
    private double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Horlicks{" +
                "calories=" + calories +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", gms=" + gms +
                '}';
    }
    public Horlicks() {
        System.out.println("Horlicks - the food drink of the night");
    }
}
