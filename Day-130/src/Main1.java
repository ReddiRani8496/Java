import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) {
        String filename = "/home/reddirani/Downloads/dataset_91022.txt"; // Replace with the actual path to your file
        int count = countNumbersGreaterThan9999(filename);
        System.out.println("The count of numbers greater than or equal to 9999 is: " + count);
    }

    public static int countNumbersGreaterThan9999(String filename) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.trim().split("\\s+");
                for (String number : numbers) {
                    int currentNumber = Integer.parseInt(number);
                    if (currentNumber >= 9999) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in the file.");
        }

        return count;
    }
}

