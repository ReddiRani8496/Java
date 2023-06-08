import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Class c = tesla.getClass();
        Annotation a = c.getAnnotation(BasicEngine.class);
        BasicEngine basicEngine = (BasicEngine) a;
        System.out.println(((BasicEngine) a).mileage()); // getting the mileage from parent class Car
        System.out.println(((BasicEngine) a).fuelType());

    }
}