import java.lang.annotation.*;

public class ReflectionEx2 {
    public static void main(String[] args) {
     /*
        Hellen hellen = new Hellen("hellen");
        boolean res = hellen.getClass().isAnnotationPresent(Handicaped.class);

        if(res) {
            hellen.printHandicaped();

        }
        else
            hellen.print();

        Arjun arjun = new Arjun("arjun");
        boolean res1 = arjun.getClass().isAnnotationPresent(Handicaped.class);
        if(res1)
            arjun.printHandicaped();
        else
            arjun.print();

      */
        Hellen hellen = new Hellen();
        Class c = hellen.getClass();
        Annotation a = c.getAnnotation(Handicaped.class); // checking whether the class contains VIP annotation or not
        Handicaped vip = (Handicaped) a;
        System.out.println(((Handicaped) a).fees()); // getting the ratings of VIP
        System.out.println(((Handicaped) a).travellingAllowances());

    }
}
@Handicaped(fees=1000, travellingAllowances = true)
class Hellen{
    String name;
    Hellen(String name) {
        this.name = name;
    }
    Hellen(){

    }
    void printHandicaped() {
        System.out.println("Does not mean less abled");
    }
    void print() {
        System.out.println("Does not mean enabled");
    }

}
class Arjun {
    String name;
    Arjun(String name) {
        this.name = name;
    }
    Arjun() {

    }
    void printHandicaped() {
        System.out.println("Does not mean less abled");
    }
    void print() {
        System.out.println("Does not mean enabled");
    }

}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Handicaped {
    int fees() default 500;
    boolean travellingAllowances() default true;

}
