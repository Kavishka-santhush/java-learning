public class Main {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar("Tesla", 2025, 75);
        
        // 1. Method Overriding (Child class එකේ override කරපු method එක run වෙනවා)
        myTesla.startEngine(); 

        // 2. Method Overloading (Parameters නැති method එක සහ parameter එකක් දාපු method එක වෙන වෙනම call කළ හැක)
        myTesla.accelerate();
        myTesla.accelerate(100);

        myTesla.displayInfo();
    }
}