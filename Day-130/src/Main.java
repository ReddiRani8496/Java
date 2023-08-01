import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "/home/reddirani/Downloads/dataset_91007.txt"; // Replace with the actual path to your file
        int greatestNumber = findGreatestNumberInFile(filename);
        System.out.println("The greatest number in the file is: " + greatestNumber);
    }

    public static int findGreatestNumberInFile(String filename) {
        int greatestNumber = Integer.MIN_VALUE;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.trim().split("\\s+");
                for (String number : numbers) {
                    int currentNumber = Integer.parseInt(number);
                    if (currentNumber > greatestNumber) {
                        greatestNumber = currentNumber;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in the file.");
        }

        return greatestNumber;
    }
}
