package grocery.softdrinks;

import grocery.Grocery;

public class ThumsUp extends Grocery {
    public int calories;
    public int quantity;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ThumsUp{" +
                "calories=" + calories +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", gms=" + gms +
                '}';
    }
}
