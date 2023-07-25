package fruit;

import java.util.Scanner;

public class Apple extends Fruit {

    private int weight = isWeightValid();

    private static int isWeightValid() {

        Scanner scan = new Scanner(System.in);

        int weight;
        System.out.print("Enter weight of Apple : ");

        while (true) {

            try {

                weight = scan.nextInt();

                if (weight > 0 && weight <= 1000) {
                    break;
                }

                System.out.println("Enter weight of Apple : ");

            } catch (Exception e) {

                System.out.println("Enter weight of Apple : ");

                scan.next();

            }
        }

        return weight;

    }

    @Override
    public void cost() {

        System.out.println("Cost of Apple = " + (weight * price) );

    }

}
