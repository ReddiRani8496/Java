import chuckNorrisCipherEncoder.ChuckNorrisCipherEncoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please input operation (encode/decode/exit):");
            String choice = scanner.nextLine();

            switch (choice) {
                case "encode" -> ChuckNorrisCipherEncoder.encodeString();
                case "decode" -> ChuckNorrisCipherEncoder.decodedString();
                case "exit" -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("There is no '" + choice + "' operation");
            }

        }

    }
}



