// Child Class / Subclass inheriting from Vehicle
class ElectricCar extends Vehicle {
    int batteryCapacity; // in kWh

    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year); // 'super' calls the parent class constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding / Adding specific behavior
    public void displayElectricCarInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Battery: " + batteryCapacity + "kWh");
    }
}