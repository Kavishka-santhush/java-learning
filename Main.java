public class Main {
    public static void main(String[] args) {
        System.out.println("Program started...");

        int a = 10;
        int b = 0;

        try {
            // Trying to divide by zero (Will throw ArithmeticException)
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception gracefully
            System.out.println("Error caught: Cannot divide a number by zero!");
        } finally {
            // This block will always execute regardless of an exception
            System.out.println("Cleanup actions done in finally block.");
        }

        System.out.println("Program continues running safely without crashing!");
    }
}