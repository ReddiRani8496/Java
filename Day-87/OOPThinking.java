import java.util.Arrays;


class OOPThinking {
    public static void main(String[] args) {
        ShowRoom showRoom1 = new ShowRoom();
        showRoom1.setName("Reliance");
        showRoom1.setBranch("Tirupati");
        showRoom1.setContactNumber(789432520);
        Computers c1 = new Computers();
        c1.setType(Type.Laptop);
        c1.setBrand("Asus");
        c1.setPrice(70000);
        c1.setProcessor("i5");
        c1.setTouchScreen(false);
        c1.setRamCapacity(16);
        c1.setInitialStock(2000);
        c1.setSold(1000);
        c1.setCurrentStock();
        Computers c2 = new Computers();
        c2.setType(Type.Desktop);
        c2.setBrand("Lenovo");
        c2.setPrice(10000);
        c2.setProcessor("i3");
        c2.setTouchScreen(false);
        c2.setRamCapacity(4);
        c2.setInitialStock(1000);
        c2.setSold(400);
        c2.setCurrentStock();
        Computers[] computers = {c1,c2};
        Mobiles m1 = new Mobiles();
        m1.setType(PhoneType.TouchScreen);
        m1.setBrand("Samsung");
        m1.setRam("8GB");
        m1.setNetworkType("5g");
        m1.setStorage("128GB");
        m1.setOperatingSystem(OperatingSystem.Android);
        m1.setInitialStock(1300);
        m1.setSold(540);
        m1.setCurrentStock();
        Mobiles m2 = new Mobiles();
        m2.setType(PhoneType.TouchScreen);
        m2.setBrand("Apple iPhone 14 pro");
        m2.setRam("8GB");
        m2.setStorage("128GB");
        m2.setNetworkType("5g");
        m2.setOperatingSystem(OperatingSystem.ios);
        m2.setInitialStock(5000);
        m2.setSold(3500);
        m2.setCurrentStock();
        Mobiles m3 = new Mobiles();
        m3.setType(PhoneType.KeyPad);
        m3.setBrand("Jio");
        m3.setRam("32Mb");
        m3.setStorage("64Mb");
        m3.setNetworkType("4g");
        m3.setOperatingSystem(OperatingSystem.Android);
        m3.setInitialStock(600);
        m3.setSold(450);
        m3.setCurrentStock();
        Mobiles[] mobiles ={m1,m2,m3};
        SmartWearable s1 = new SmartWearable();
        s1.setCategories(Categories.SmartWatches);
        s1.setBrand("Noise");
        s1.setPrice(1500);
        s1.setInitialStock(3000);
        s1.setSold(2800);
        s1.setCurrentStock();
        SmartWearable s2 = new SmartWearable();
        s2.setCategories(Categories.SmartBands);
        s2.setBrand("Realme");
        s2.setPrice(1900);
        s2.setInitialStock(500);
        s2.setSold(300);
        s2.setCurrentStock();
        SmartWearable[] smartWearables = {s1,s2};
        showRoom1.setMobiles(mobiles);
        showRoom1.setComputers(computers);
        showRoom1.setSmartWearable(smartWearables);
        System.out.println(showRoom1);
    }
}
class ShowRoom {
    String name;
    String branch;
    long contactNumber;

    Object[] SmartWearable;
    Object[] Mobiles;
    Object[] Computers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Object[] getSmartWearable() {
        return SmartWearable;
    }

    public void setSmartWearable(Object[] smartWearable) {
        SmartWearable = smartWearable;
    }

    public Object[] getMobiles() {
        return Mobiles;
    }

    public void setMobiles(Object[] mobiles) {
        Mobiles = mobiles;
    }

    public Object[] getComputers() {
        return Computers;
    }

    public void setComputers(Object[] computers) {
        Computers = computers;
    }

    @Override
    public String toString() {
        return "ShowRoom{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", contactNumber=" + contactNumber +
                ", SmartWearable=" + Arrays.toString(SmartWearable) +
                ", Mobiles=" + Arrays.toString(Mobiles) +
                ", Computers=" + Arrays.toString(Computers) +
                '}';
    }
}
