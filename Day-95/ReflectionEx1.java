import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionEx1 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

      /*  Modi modi = new Modi("modi");
        boolean res = modi.getClass().isAnnotationPresent(VIP.class); // checking whether the class contains VIP annotation or not
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for(Method m : modi.getClass().getDeclaredMethods()) {
            if(m.getName().equals(str)) // checking whether the entered method is in the Modi class or not, if present we will call the method
                m.invoke(modi);
            else
                System.out.println("Invalid choice");
        }
        */

        Modi modi = new Modi();
        Class c = modi.getClass();
        Annotation a = c.getAnnotation(VIP.class); // checking whether the class contains VIP annotation or not
        VIP vip = (VIP) a;
        System.out.println(((VIP) a).rating()); // getting the ratings of VIP
        System.out.println(((VIP) a).star()); // getting the star of VIP

       /* Rahul rahul = new Rahul();
        Class c1 = rahul.getClass();
        Annotation a1 = c1.getAnnotation(VIP.class);
        VIP vip1 = (VIP) a1;
        System.out.println(((VIP) a1).rating());
        System.out.println(((VIP) a1).star()); */
    }
}
@VIP(rating = 4, star = "Leo")
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
    int rating() default 1;
    String star();
}


