// 1. Common Car Interface
interface Car {
    void assemble();
}

// 2. Concrete Implementations
class ElectricCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an Electric Car with battery and motors.");
    }
}

class GasCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling a Gas Car with engine and fuel tank.");
    }
}

// 3. Car Factory Class (Handles object creation logic)
class CarFactory {
    public static Car createCar(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("ELECTRIC")) {
            return new ElectricCar();
        } else if (type.equalsIgnoreCase("GAS")) {
            return new GasCar();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Factory to create objects without using 'new' directly in main
        Car car1 = CarFactory.createCar("ELECTRIC");
        if (car1 != null) {
            car1.assemble();
        }

        Car car2 = CarFactory.createCar("GAS");
        if (car2 != null) {
            car2.assemble();
        }
    }
}