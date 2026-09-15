// Parent Class / Superclass
class Vehicle {
    protected String brand; // protected allows subclasses to access directly
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }
}