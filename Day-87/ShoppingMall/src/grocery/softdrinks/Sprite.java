package grocery.softdrinks;

import grocery.Grocery;

public class Sprite extends Grocery {
     public double quantity;

     public double getQuantity() {
          return quantity;
     }

     public void setQuantity(double quantity) {
          this.quantity = quantity;
     }

     @Override
     public String toString() {
          return "Sprite{" +
                  "quantity=" + quantity +
                  ", brand='" + brand + '\'' +
                  ", price=" + price +
                  ", gms=" + gms +
                  '}';
     }
}
