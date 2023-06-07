import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ReflectionEx {

    public static void main(String[] args) {

        Modi modi = new Modi("modi");

        boolean res = modi.getClass().isAnnotationPresent(VIP.class); // checking whether the class contains VIP annotation or not

        if(res) // if VIP annotation contains for the class then we are printing name in upper case

            modi.printVIP();

        else // if VIP annotation not contains for the class then we are printing name in lower case
            modi.print();

        Rahul rahul = new Rahul("rahul");

        boolean res1 = rahul.getClass().isAnnotationPresent(VIP.class); // checking whether the class contains VIP annotation or not

        if(res1)

            rahul.printVIP();

        else

            rahul.print();
    }
}
@VIP
class Modi{

    String name;
    Modi(String name) {
        this.name = name;
    }
    Modi() {

    }
    void printVIP() {
        System.out.println(name.toUpperCase());
    }
    void print() {
        System.out.println(name);
    }

}
class Rahul {
    String name;
    Rahul(String name) {
        this.name = name;
    }
    Rahul(){

    }
    void printVIP() {
        System.out.println(name.toUpperCase());
    }
    void print() {
        System.out.println(name);
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface VIP {

}

