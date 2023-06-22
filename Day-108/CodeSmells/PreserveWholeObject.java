import java.awt.*;

/*
Preserve Whole Object: Instead of getting several values from an object and
                       then passing them as parameters to a method, pass the whole object
 */
public class PreserveWholeObject {

    public static void main(String[] args) {

        Point p = new Point(5,10);

        int x = p.x;

        int y = p.y;

        int r = findArea(p);

        System.out.println(r);

    }
    public static int findArea(Point p) {

        return p.x * p.y;
        
    }
}
