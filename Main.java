import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating a list of car brands
        List<String> carBrands = Arrays.asList("Toyota", "Tesla", "Honda", "Tata", "Tesla Model S");

        System.out.println("--- Filtering cars starting with 'T' using Streams ---");

        // Using Stream API and Lambda Expression
        List<String> filteredCars = carBrands.stream()
                .filter(car -> car.startsWith("T")) // Lambda expression to filter
                .map(String::toUpperCase)           // Converting to uppercase
                .collect(Collectors.toList());      // Collecting results into a list

        // Printing the filtered list
        filteredCars.forEach(car -> System.out.println(car));
    }
}