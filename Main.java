// 1. ISP: Segregating interfaces so classes only implement what they need
interface Drivable {
    void drive();
}

interface Chargeable {
    void charge();
}

// 2. Low-level module implementing specific interface
class ElectricCar implements Drivable, Chargeable {
    @Override
    public void drive() {
        System.out.println("Electric car is driving smoothly.");
    }

    @Override
    public void charge() {
        System.out.println("Charging electric car battery.");
    }
}

// 3. High-level module depending on Abstraction (DIP), not on concrete ElectricCar class
class VehicleManager {
    private Drivable vehicle;

    public VehicleManager(Drivable vehicle) {
        this.vehicle = vehicle; // Dependency injection via interface
    }

    public void startJourney() {
        vehicle.drive();
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar();
        
        // Using DIP: VehicleManager depends on Drivable interface abstraction
        VehicleManager manager = new VehicleManager(myTesla);
        manager.startJourney();
        
        myTesla.charge();
    }
}