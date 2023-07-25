package fruit;

import java.util.Scanner;

public class Mango implements Fruit {
    private double weight;
    private double cost;

    @Override
    public void cost() {

    }

    public Mango() {
        cost= getCost();
        weight = isWeightValid();
    }
    double getCost() {
        return Math.random()*101;
    }

    private static int isWeightValid() {

        Scanner scan = new Scanner(System.in);

        int weight;
        System.out.print("Enter weight of Mango: ");

        while (true) {

            try {


                weight = scan.nextInt();

                if (weight > 0 && weight <= 1000) {
                    break;
                }

                System.out.println("Enter weight of Mango: ");

            } catch (Exception e) {

                System.out.println("Enter weight of Mango: ");

                scan.next();

            }
        }

        return weight;

    }

    public Mango(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Mango{" +
                "brand=" + brand +
                "weight=" + weight +
                ", cost=" + (cost * weight) +
                '}';
    }
}






