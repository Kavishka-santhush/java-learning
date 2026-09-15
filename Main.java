// 1. Car Class with private constructor and a static Nested Builder Class
class Car {
    private String brand;
    private int year;
    private String color;
    private boolean hasSunroof;

    // Private constructor taking Builder as argument
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.year = builder.year;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
    }

    public void displayCar() {
        System.out.println("Car Details -> Brand: " + brand + ", Year: " + year + ", Color: " + color + ", Sunroof: " + hasSunroof);
    }

    // 2. Static Nested Builder Class
    public static class CarBuilder {
        private String brand;
        private int year;
        private String color = "White"; // Default value
        private boolean hasSunroof = false;

        public CarBuilder(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this; // Returning builder for method chaining
        }

        public CarBuilder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Car build() {
            return new Car(this); // Creating the final Car object
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Builder Pattern with Method Chaining
        Car myCar = new Car.CarBuilder("Tesla", 2026)
                .setColor("Midnight Black")
                .setSunroof(true)
                .build();

        myCar.displayCar();
    }
}