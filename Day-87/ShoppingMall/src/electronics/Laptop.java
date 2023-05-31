package electronics;

public class Laptop extends Electronic{
    OS os;
    Processor processor;

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os=" + os +
                ", processor=" + processor +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}
