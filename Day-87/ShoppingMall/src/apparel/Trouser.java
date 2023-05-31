package apparel;

public class Trouser extends Apparel{
    int size;
    ClothType type;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ClothType getType() {
        return type;
    }

    public void setType(ClothType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Trouser{" +
                "size=" + size +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
