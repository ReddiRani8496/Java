package electronics;

public class Electronic {
     double price;
     String brand;
    double weight;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}
