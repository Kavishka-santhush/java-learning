// 1. Base Class for Vehicles
class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

// 2. Gas Car extends Vehicle perfectly
class GasCar extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Gas car engine started with V8 roar.");
    }
}

// 3. Electric Car extends Vehicle and respects LSP
class ElectricCar extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Electric car power system activated silently.");
    }
}

// 4. A helper class that processes any Vehicle safely (Demonstrating LSP)
class VehicleWorkshop {
    public static void serviceVehicle(Vehicle vehicle) {
        System.out.println("Bringing vehicle into workshop bay...");
        vehicle.startEngine(); // Works perfectly whether it's a GasCar or ElectricCar!
        System.out.println("Service completed successfully.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle regularCar = new GasCar();
        Vehicle tesla = new ElectricCar();

        // Testing Liskov Substitution Principle
        // Both child classes can substitute the base class (Vehicle) without breaking the program
        VehicleWorkshop.serviceVehicle(regularCar);
        VehicleWorkshop.serviceVehicle(tesla);
    }
}