class Car {
    private String brand;
    private Engine engine; // "Has-a" relationship (Car has an Engine)

    public Car(String brand, String engineType, int horsepower) {
        this.brand = brand;
        // Composition: Engine object is created inside Car constructor
        this.engine = new Engine(engineType, horsepower);
    }

    public void startCar() {
        System.out.println(brand + " is ready to move.");
        engine.start(); // Delegating task to engine object
    }
}