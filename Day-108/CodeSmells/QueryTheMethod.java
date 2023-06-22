import java.util.Scanner;

/*
Replace Temp with Query: Move the entire expression to a separate method and
return the result from it. Query the method instead of using a variable.
Incorporate the new method in other methods, if necessary.
 */
public class QueryTheMethod {
    public static double quantity = 1500;
    public static double itemPrice = 120.50;

    public static void main(String[] args) {

        calculateTotal();

    }
    public static double calculateTotal() {

        if(basePrice()>1000) {

            return basePrice() * 0.95;
        }

        else {

            return basePrice()*0.98;

        }
    }
    public static double basePrice() {

        return quantity * itemPrice;


    }
}

