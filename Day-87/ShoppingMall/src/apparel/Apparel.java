package apparel;

import jdk.jfr.Category;

public class Apparel {
    String brand;
    double price;
    Category category;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Apparel{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
