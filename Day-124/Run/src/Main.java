import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import run.*;

public class Main {
    static List<Run> list = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String operation;

        do {

            System.out.print("\nEnter a command (add, display, sort, exit): ");
            operation = scan.next();

            switch (operation.toLowerCase()) {

                case "add": addRunner();
                            break;

                case "display": display();
                             break;

                case "sort" : sortByLongestDistance();
                              break;

                case "exit": System.out.println("Successfully exited\n");
                             break;

                default: System.out.println("Enter valid details");
            }

        } while (!operation.equals("exit"));
    }

    private static void addRunner() {

         Run run = new Run();
         run.get();

        list.add(run);

    }
    private static void display() {

        System.out.println();

        for(var runners : list)
            System.out.println(runners);

    }
    public  static void sortByLongestDistance() {

        list.sort(new SortByDistance());

        for (Run value : list) {

            System.out.println("\nThe runner who has covered the longest distance: "+value.getRunnerName());

            return;
        }

    }
}
