class Car {
    // Private variables (Data Hiding)
    private String brand;
    private int year;

    // Constructor to initialize values
    public Car(String brand, int year) {
        setBrand(brand);
        setYear(year);
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand (with validation logic if needed)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year with a simple validation rule
    public void setYear(int year) {
        if (year > 1885) { // First car was invented around 1886
            this.year = year;
        } else {
            System.out.println("Invalid year! Setting default to 2000.");
            this.year = 2000;
        }
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }
}

