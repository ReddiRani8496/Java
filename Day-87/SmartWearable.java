import java.util.*;
public class SmartWearable {
    private Categories categories;
    private String brand;
    private double price;
    private int initialStock;
    private int sold;

    private int currentStock;

    private SmartWearable[] smartWearable;

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInitialStock() {
        return initialStock;
    }

    public void setInitialStock(int initialStock) {
        this.initialStock = initialStock;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }



    public SmartWearable[] getSmartWearable() {
        return smartWearable;
    }

    public void setSmartWearable(SmartWearable[] smartWearable) {
        this.smartWearable = smartWearable;
    }

    public void setCurrentStock() {
        this.currentStock = this.initialStock-this.sold;
    }
    public int getCurrentStock() {
        return currentStock;
    }
    

    @Override
    public String toString() {
        return "SmartWearable{" +
                "categories=" + categories +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", initialStock=" + initialStock +
                ", sold=" + sold +
                ", currentStock=" + currentStock +

                '}';
    }
}
enum Categories {
    SmartWatches,
    SmartBands,
    SmartGlasses
}

