public class House {
    private double length;
    private double width;
    private double height;

    public double getLength() {

        return length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "House{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
