import java.util.Arrays;

public class Computers {
    private String Brand;
    private double price;
    private String processor;
    private boolean isTouchScreen;
    private int ramCapacity;
    private Type type;
    private int initialStock;
    private int sold;
    private int currentStock;

    private Computers[] computers;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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



    public Computers[] getComputers() {
        return computers;
    }

    public void setComputers(Computers[] computers) {
        this.computers = computers;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock() {
        this.currentStock = this.initialStock-this.sold;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "Brand='" + Brand + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", isTouchScreen=" + isTouchScreen +
                ", ramCapacity=" + ramCapacity +
                ", type=" + type +
                ", initialStock=" + initialStock +
                ", sold=" + sold +
                ", currentStock=" + currentStock +

                '}';
    }
}
enum Type {
    Laptop, Desktop
}

