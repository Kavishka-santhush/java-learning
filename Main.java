// Implementing Runnable interface for a task
class CarEngineWorker implements Runnable {
    private String carName;

    public CarEngineWorker(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(carName + " engine checking step: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println(carName + " check completed!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        // Creating two threads for two cars
        Thread t1 = new Thread(new CarEngineWorker("Tesla"));
        Thread t2 = new Thread(new CarEngineWorker("BMW"));

        // Starting threads (Runs concurrently)
        t1.start();
        t2.start();

        System.out.println("Main thread finished initiating workers.");
    }
}