class Vehicle {
    protected String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method Overriding සඳහා පාවිච්චි කරන Base Method එක
    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }

    // Method Overloading (একම නමින් methods දෙකක්, parameters වෙනස්)
    public void accelerate() {
        System.out.println("Vehicle is accelerating...");
    }

    public void accelerate(int speed) {
        System.out.println("Vehicle is accelerating at " + speed + " km/h");
    }
}