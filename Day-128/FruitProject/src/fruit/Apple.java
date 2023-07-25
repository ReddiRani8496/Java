package fruit;

import java.util.Scanner;

public class Apple implements Fruit {

    private double weight;
    private double cost;

    @Override
    public void cost() {

    }

    public Apple() {
        cost= getCost();
        weight = isWeightValid();
    }
    double getCost() {
        return Math.random()*101;
    }

    private static int isWeightValid() {

        Scanner scan = new Scanner(System.in);

        int weight;
        System.out.print("Enter weight of Apple: ");

        while (true) {

            try {


                weight = scan.nextInt();

                if (weight > 0 && weight <= 1000) {
                    break;
                }

                System.out.println("Enter weight of Apple: ");

            } catch (Exception e) {

                System.out.println("Enter weight of Apple: ");

                scan.next();

            }
        }

        return weight;

    }

    public Apple(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "brand=" + brand +
                "weight=" + weight +
                ", cost=" + (cost * weight) +
                '}';
    }
}
