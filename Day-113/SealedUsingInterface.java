public class SealedUsingInterface {
    public static void main(String[] args) {
        Laptops laptops = new Laptops();
        laptops.running();
        Mobiles mobiles = new Mobiles();
        mobiles.running();
    }
}
sealed interface Electronics permits Laptops,Mobiles {
     public void running();
}
final class Laptops implements Electronics {
     @Override
     public void  running() {
         System.out.println("Laptop is running");
     }
}

non-sealed class Mobiles implements Electronics {
    @Override
    public void running() {
        System.out.println("Mobile is running");
    }
}