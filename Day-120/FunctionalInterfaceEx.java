public class FunctionalInterfaceEx {
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface dog {
    void bark();
}
interface cat extends dog { // we can extend functional interface
    void meow();
}

interface tiger implements dog { // we can't implement one interface in another interface
    void bark();
}

@FunctionalInterface

interface cow extends dog {
    //void sound(); // we can't write method in functional interface while extending another functional interface
}