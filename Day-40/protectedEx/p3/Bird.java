package p3;
import p1.Duck;
public class Bird {
    public static void main(String[] args) {
        Bird b=new Bird();
        b.sound(); //since sound method is protected, we cannot access non-subclass.
    }
}
