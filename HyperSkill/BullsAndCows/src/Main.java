
import  java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = 0;
        int symbols = 0;

        try {
            System.out.println("Input the length of the secret code:");
            length = scanner.nextInt();
            System.out.println("Input the number of possible symbols in the code:");
            symbols = scanner.nextInt();

            if (length < 1 || symbols < length || symbols > 36) {
                throw new IllegalArgumentException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: invalid input! Please enter valid integers.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: it's not possible to generate a code with a length of " +
                    length + " with " + symbols + " unique symbols.");
            return;
        }

        String secretCode = generateSecretCode(length, symbols);
        System.out.println("The secret is prepared: " + "*".repeat(length) + " (0-" +
                (symbols <= 10 ? symbols - 1 : "9, a-" + (char) ('a' + symbols - 11)) + ").");

        System.out.println("Okay, let's start a game!");

        playGame(secretCode);
    }

    public static String generateSecretCode(int length, int numSymbols) {
        List<Character> possibleSymbols = new ArrayList<>();
        for (int i = 0; i < numSymbols; i++) {
            if (i < 10) {
                possibleSymbols.add((char) ('0' + i));
            } else {
                possibleSymbols.add((char) ('a' + i - 10));
            }
        }

        Collections.shuffle(possibleSymbols);

        StringBuilder secretCode = new StringBuilder();
        for (int i = 0; i < length; i++) {
            secretCode.append(possibleSymbols.get(i));
        }

        return secretCode.toString();
    }

    public static void playGame(String secretCode) {
        Scanner scanner = new Scanner(System.in);
        int turn = 1;

        while (true) {
            System.out.println("Turn " + turn + ":");
            String userInput = scanner.next();
            String grade = gradeAnswer(userInput, secretCode);

            System.out.println("Grade: " + grade);

            if (userInput.equals(secretCode)) {
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }

            turn++;
        }
    }

    public static String gradeAnswer(String userInput, String secretCode) {
        int bulls = 0;
        int cows = 0;

        Set<Character> secretDigitsSet = new HashSet<>();
        for (char ch : secretCode.toCharArray()) {
            secretDigitsSet.add(ch);
        }

        for (int i = 0; i < userInput.length(); i++) {
            char userChar = userInput.charAt(i);
            char secretChar = secretCode.charAt(i);

            if (userChar == secretChar) {
                bulls++;
            } else if (secretDigitsSet.contains(userChar)) {
                cows++;
            }
        }

        if (bulls == 0 && cows == 0) {
            return "None.";
        } else {
            String result = "";
            if (bulls > 0) {
                result += bulls + (bulls == 1 ? " bull" : " bulls");
            }
            if (cows > 0) {
                if (bulls > 0) {
                    result += " and ";
                }
                result += cows + (cows == 1 ? " cow" : " cows");
            }
            return result;
        }
    }
}
