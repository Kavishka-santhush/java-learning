// 1. Small, specific interfaces (Segregated Interfaces)
interface Drivable {
    void drive();
}

interface Chargeable {
    void chargeBattery();
}

interface Refuelable {
    void refuelGas();
}

// 2. ElectricCar implements only what it needs
class ElectricCar implements Drivable, Chargeable {
    @Override
    public void drive() {
        System.out.println("Electric car is driving silently.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging electric car at Supercharger station.");
    }
}

// 3. GasCar implements only what it needs (No forced empty methods for charging!)
class GasCar implements Drivable, Refuelable {
    @Override
    public void drive() {
        System.out.println("Gas car is driving with engine power.");
    }

    @Override
    public void refuelGas() {
        System.out.println("Refueling gas car at fuel station.");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.drive();
        tesla.chargeBattery();

        System.out.println("-------------------");

        GasCar bmw = new GasCar();
        bmw.drive();
        bmw.refuelGas();
    }
}