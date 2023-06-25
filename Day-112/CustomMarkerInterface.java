public class CustomMarkerInterface {
    public static void main(String[] args) {

        SBI s1 = new SBI();
        if(s1 instanceof RBI) {
            System.out.println("allow operations");
        } else {
            System.out.println("Take permission from RBI");
        }

        IDBI i = new IDBI();
        if(i instanceof RBI) {
            System.out.println("allow operations");
        } else {
            System.out.println("Take permission from RBI");
        }
    }
}
class SBI {

}

class IDBI implements RBI {

}
interface RBI {

}
