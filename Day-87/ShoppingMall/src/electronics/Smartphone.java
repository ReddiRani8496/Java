package electronics;

public class Smartphone extends Electronic {
    double screenSize;

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "screenSize=" + screenSize +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}
