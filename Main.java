import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "car_log.txt";

        // 1. Writing to a file using FileWriter
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Car Inventory System Log:\n");
            writer.write("1. Tesla Model S - 2025\n");
            writer.write("2. BMW V8 Turbo - 2024\n");
            writer.close(); // Always close the writer
            System.out.println("Data successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // 2. Reading from the file using BufferedReader
        System.out.println("\n--- Reading from the File ---");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); // Always close the reader
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}