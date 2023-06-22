/*
Introduce Parameter Object: If your methods contain a repeating group of parameters.

Replace parameters with an object.
 */
import java.awt.*;

public class ParameterObject {

    public static void main(String[] args) {

        Point p = new Point(5,10);

        int r = findArea(p,20);

        System.out.println(r);
    }
    public  static int findArea(Point p,int radius) {

        return p.x * p.y * radius;

    }
}
