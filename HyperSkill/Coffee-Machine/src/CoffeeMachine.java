import java.util.Scanner;

public class CoffeeMachine {
    static int water;
    static int milk;
    static int coffeeBeans;
    static int disposableCups;
    static int cost;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        water = 400;
        milk = 540;
        coffeeBeans = 120;
        disposableCups = 9;
        cost = 550;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String option = scanner.next();
            switch (option) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> take();
                case "remaining" -> remaining();
                case "exit" -> {
                    return;
                }
                default -> System.out.println("Enter a valid choice");
            }
        }
    }

    private static void buy() {
        while (true) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String choice = scanner.next();

            if (choice.equals("back")) {
                return;
            }


            int coffeeChoice = Integer.parseInt(choice);
            switch (coffeeChoice) {
                case 1 -> {
                    makeCoffee(250, 0, 16, 4);
                    return;
                }
                case 2 -> {
                    makeCoffee(350, 75, 20, 7);
                    return;
                }
                case 3 -> {
                    makeCoffee(200, 100, 12, 6);
                    return;
                }
                default -> System.out.println("Enter a valid choice");
            }
        }

    }

    private static void makeCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int coffeeCost) {
        if (water >= waterNeeded && milk >= milkNeeded && coffeeBeans >= coffeeBeansNeeded && disposableCups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= coffeeBeansNeeded;
            disposableCups -= 1;
            cost += coffeeCost;
        } else {
            System.out.println("Sorry, not enough resources to make coffee!");
        }
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        disposableCups += scanner.nextInt();
    }

    private static void take() {
        System.out.println("I gave you $" + cost);
        cost = 0;
    }

    private static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + cost + " of money");
    }
}
