public class SealedClasses {
    public static void main(String[] args) {
      Rectangle r = new Rectangle();
      System.out.println( r.areaOfRectangle(10.5,20.5));
      Square square = new Square();
      System.out.println( square.areaOfSquare(20));
 
    }
}
sealed class Shape permits Rectangle,Square,Triangle {
    double length;
    double breadth;
    double base;
    double height;
    double side;
}
non-sealed class Rectangle extends Shape { // the subclass of sealed class must be non-sealed or final or sealed
    double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }
}
non-sealed class Square extends Shape {
    double areaOfSquare(double side) {
        return side * side;
    }
}
final class Triangle extends Shape {
    double areaOfTriangle(double base, double height) {
        return (0.5*base*height);
    }
}