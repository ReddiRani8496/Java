import apparel.SareeType;
import apparel.Sarees;
import apparel.Trouser;
import electronics.Electronic;
import electronics.Laptop;
import electronics.OS;
import grocery.healthdrinks.Boost;
import grocery.softdrinks.Sprite;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBrand("Asus");
        laptop.setPrice(60000);
        laptop.setOs(OS.LINUX);

        Sarees sarees = new Sarees();
        sarees.setColor("Pink");
        sarees.setSareeType(SareeType.KANCHIPURAM);

        Boost boost = new Boost();
        boost.setBrand("Nestle");
        boost.setPrice(300);

        System.out.println(laptop);

        System.out.println(sarees);

        System.out.println(boost);

    }
}