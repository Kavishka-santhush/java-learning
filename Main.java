public class Main {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle("Test", 2020); -> Error! Cannot instantiate abstract class.

        ElectricCar myTesla = new ElectricCar("Tesla Model S", 2025, 100);
        
        myTesla.displayInfo();
        myTesla.drive();
        myTesla.chargeBattery();
    }
}