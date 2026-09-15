// 1. Strategy Interface
interface DrivingStrategy {
    void drive();
}

// 2. Concrete Strategies
class EcoMode implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in Eco Mode: Maximizing fuel efficiency and low acceleration.");
    }
}

class SportMode implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Driving in Sport Mode: Maximum power, fast acceleration, and stiff steering!");
    }
}

// 3. Context Class that uses a DrivingStrategy
class CarContext {
    private DrivingStrategy strategy;

    // Setting initial strategy
    public CarContext(DrivingStrategy strategy) {
        this.strategy = strategy;
    }

    // Changing strategy at runtime
    public void setStrategy(DrivingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeDrive() {
        strategy.drive();
    }
}

public class Main {
    public static void main(String[] args) {
        // Starting car in Eco Mode
        CarContext myCar = new CarContext(new EcoMode());
        myCar.executeDrive();

        // Switching to Sport Mode at runtime
        System.out.println("\n--- Switching to Sport Mode ---");
        myCar.setStrategy(new SportMode());
        myCar.executeDrive();
    }
}