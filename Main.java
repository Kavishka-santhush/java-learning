import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 1. ArrayList Example (Storing a list of car brands)
        ArrayList<String> carBrands = new ArrayList<>();
        
        carBrands.add("Toyota");
        carBrands.add("Honda");
        carBrands.add("Tesla");

        System.out.println("--- Car Brands List ---");
        for (String brand : carBrands) {
            System.out.println(brand);
        }

        // 2. HashMap Example (Storing car brand and its model count as Key-Value)
        HashMap<String, Integer> carModelsCount = new HashMap<>();
        
        carModelsCount.put("Toyota", 15);
        carModelsCount.put("Honda", 10);
        carModelsCount.put("Tesla", 5);

        System.out.println("\n--- Car Models Count (HashMap) ---");
        System.out.println("Toyota models available: " + carModelsCount.get("Toyota"));
        System.out.println("Tesla models available: " + carModelsCount.get("Tesla"));
    }
}