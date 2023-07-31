import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName);

        int playerScore = readPlayerScore(playerName);

        String inputOptions = scanner.nextLine().toLowerCase();
        List<String> options = inputOptions.isEmpty() ? Arrays.asList("rock", "paper", "scissors") : Arrays.asList(inputOptions.split(","));

        Random random = new Random();

        System.out.println("Okay, let's start");

        while (true) {

            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("!exit")) {
                System.out.println("Bye!");
                break;
            } else if (userInput.equals("!rating")) {
                System.out.println("Your rating: " + playerScore);
            } else if (isValidOption(userInput, options)) {

                String computerChoice = options.get(random.nextInt(options.size()));

                if (userInput.equals(computerChoice)) {
                    System.out.println("There is a draw (" + userInput + ")");
                    playerScore += 50;
                } else if (!(isWinningOption(userInput, computerChoice,options))) {
                    System.out.println("Well done. The computer chose " + computerChoice + " and failed");
                    playerScore += 100;
                } else {
                    System.out.println("Sorry, but the computer chose " + computerChoice);
                }
            } else {
                System.out.println("Invalid input");
            }
        }

        updatePlayerScore(playerName, playerScore);

        scanner.close();
    }

    private static boolean isValidOption(String userInput, List<String> options) {
        return options.contains(userInput);
    }

    private static int readPlayerScore(String playerName) {
        try {
            File file = new File("rating.txt");
            if (file.exists()) {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(" ");
                    if (parts[0].equals(playerName)) {
                        return Integer.parseInt(parts[1]);
                    }
                }
                fileScanner.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static void updatePlayerScore(String playerName, int playerScore) {
        try {
            File file = new File("rating.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            writer.write(playerName + " " + playerScore);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> reorderOptions(String userInput, List<String> options) {
        int index = options.indexOf(userInput);

        if (index == -1) {
            return options;
        }

        List<String> reorderedOptions = new ArrayList<>();
        for (int i = index + 1; i < options.size(); i++) {
            reorderedOptions.add(options.get(i));
        }
        for (int i = 0; i < index; i++) {
            reorderedOptions.add(options.get(i));
        }
        return reorderedOptions;
    }

    private static boolean isWinningOption(String userInput, String computerChoice,List<String> options) {
        List<String> winningOptions = getWinningOptions(userInput,options);
        return winningOptions.contains(computerChoice);
    }

    private static List<String> getWinningOptions(String userInput,List<String> options ) {
        List<String> reorderedOptions = reorderOptions(userInput, options);
        return reorderedOptions.subList(0, reorderedOptions.size() / 2);
    }
}
