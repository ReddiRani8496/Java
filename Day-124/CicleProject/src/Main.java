public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setRadius(circle.readRadius());

        double circleArea = circle.area();
        System.out.println("Area of circle: "+ circleArea);

        double circleCircumference = circle.circum();
        System.out.println("Circumference of the circle: "+ circleCircumference);

    }
}
