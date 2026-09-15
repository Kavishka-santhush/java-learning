public class Main {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar("Tesla", 2025, 75);
        
        myTesla.startEngine(); // Inherited method from Vehicle class
        myTesla.displayElectricCarInfo(); // Specific method in ElectricCar class
    }
}