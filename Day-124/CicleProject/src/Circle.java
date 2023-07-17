import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
    private double radius;

    static Scanner scan = new Scanner(System.in);

    Circle() {

        radius = 0;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public double area() {

        double circleArea = Math.PI * radius * radius;
        return circleArea;

    }

    public double circum() {

        double circleCircumference = 2 * Math.PI * radius;
        return circleCircumference;

    }

    public  double readRadius() {

        double radius = 0;

        while (true) {

            try {

                System.out.print("Enter the radius of the circle : ");
                radius = scan.nextDouble();

                if(radius >= 0)
                    break;

                System.out.println("The radius of the circle must be minimum zero");

            } catch (InputMismatchException e) {

                System.out.println("Enter a number for radius");

                scan.next();

            }
        }

        return radius;

    }

}