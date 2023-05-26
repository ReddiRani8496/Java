public class AreaOfCircle {
    
    public static void main(String[] args) {
        
        Circle c = (r) -> Math.PI*(r*r);
        
        System.out.println((c.area(2.5)));
    }
}
interface Circle {

    double area(double r);
}
