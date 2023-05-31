import java.util.Arrays;

public class Mobiles {
    private String brand;
    private String ram;
    private String storage;
    private String networkType;
    private OperatingSystem operatingSystem;
    private PhoneType  type;

    private int initialStock;
    private int sold;
    private  int currentStock;

    private Mobiles[] mobiles;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
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



    public Mobiles[] getMobiles() {
        return mobiles;
    }

    public void setMobiles(Mobiles[] mobiles) {
        this.mobiles = mobiles;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock() {
        this.currentStock = this.initialStock-this.sold;
    }

    @Override
    public String toString() {
        return "Mobiles{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", networkType=" + networkType +
                ", operatingSystem=" + operatingSystem +
                ", type=" + type +
                ", initialStock=" + initialStock +
                ", sold=" + sold +
                ", currentStock=" + currentStock +

                '}';
    }
}
enum OperatingSystem {
    Android,ios;
}
enum  PhoneType {
    KeyPad, TouchScreen
}

