// Program to demonstrate the IS-A relationship
public class Device {
    private String deviceName;
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;

    }
    public void getDeviceName(){
        System.out.println(deviceName + " is a device");
    }
}
class Bulb extends Device {
    public static void main(String[] args) {
        Device device = new Bulb();
        device.setDeviceName("Bulb");
        device.getDeviceName();

    }
}
