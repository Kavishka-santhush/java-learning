// 1. Abstraction (Interface)
interface Engine {
    void start();
}

// 2. Low-level module 1
class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine starting silently with high voltage.");
    }
}

// 3. Low-level module 2 (Can be added easily without changing manager)
class V8GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("V8 Gas engine roaring to life with fuel injection!");
    }
}

// 4. High-level module depending on Abstraction (DIP), not on concrete engines
class CarManager {
    private Engine engine; // Depending on Interface, not on a specific engine class

    // Dependency Injection via constructor
    public CarManager(Engine engine) {
        this.engine = engine;
    }

    public void driveCar() {
        engine.start();
        System.out.println("Car is moving forward smoothly.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        // Injecting Electric Engine
        Engine electricEngine = new ElectricEngine();
        CarManager teslaManager = new CarManager(electricEngine);
        teslaManager.driveCar();

        // Injecting V8 Gas Engine seamlessly thanks to DIP
        Engine v8Engine = new V8GasEngine();
        CarManager muscleCarManager = new CarManager(v8Engine);
        muscleCarManager.driveCar();
    }
}