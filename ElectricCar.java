class ElectricCar extends Vehicle {
    int batteryCapacity;

    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    // Method Overriding (Parent Class එකේ තියෙන startEngine method එක override කිරීම)
    @Override
    public void startEngine() {
        System.out.println("Electric car silent start: Systems online!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Battery: " + batteryCapacity + "kWh");
    }
}