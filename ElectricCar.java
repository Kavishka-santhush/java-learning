class ElectricCar extends Vehicle implements Chargeable {
    int batteryCapacity;

    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    // Implementing the abstract method from Vehicle
    @Override
    public void drive() {
        System.out.println(brand + " is driving silently using electric power.");
    }

    // Implementing the method from Chargeable interface
    @Override
    public void chargeBattery() {
        System.out.println(brand + " battery is charging. Capacity: " + batteryCapacity + "kWh");
    }
}