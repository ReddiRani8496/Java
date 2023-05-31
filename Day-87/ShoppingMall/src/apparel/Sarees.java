package apparel;

public class Sarees extends Apparel{
    private String color;
   private SareeType sareeType;

    public SareeType getSareeType() {
        return sareeType;
    }

    public void setSareeType(SareeType sareeType) {
        this.sareeType = sareeType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sarees{" +
                "color='" + color + '\'' +
                ", sareeType=" + sareeType +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
