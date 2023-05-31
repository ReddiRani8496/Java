package grocery;

public class Grocery {
    public String brand;
    public double price;
    public double gms;

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

    public double getGms() {
        return gms;
    }

    public void setGms(double gms) {
        this.gms = gms;
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", gms=" + gms +
                '}';
    }
}
