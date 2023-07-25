package fruit;

import java.util.Scanner;

public class Mango extends Fruit {



    private int weight = isWeightValid();



    private static int isWeightValid() {
        Scanner scan = new Scanner(System.in);
        int weight;
        System.out.print("Enter quantity of Mango: ");

        while (true) {

            try {


                weight = scan.nextInt();

                if (weight > 0 && weight <= 1000) {
                    break;
                }

                System.out.println("Enter quantity of Mango: ");

            } catch (Exception e) {

                System.out.println("Enter quantity of Mango: ");

                scan.next();

            }
        }

        return weight;

    }
    @Override
    public void cost() {

        System.out.println("Cost of Mango = " + (weight * price));

    }

}
