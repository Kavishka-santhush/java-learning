public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        car1.displayInfo();

        // Trying to set an invalid year using Setter
        car1.setYear(1800); 
        car1.displayInfo();
    }
}