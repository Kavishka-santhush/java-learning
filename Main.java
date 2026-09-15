import java.util.List;
import java.util.ArrayList;

// 1. Observer Interface
interface Observer {
    void update(String status);
}

// 2. Subject (The object being monitored)
class CarTelemetry {
    private List<Observer> observers = new ArrayList<>();
    private String carStatus;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setCarStatus(String status) {
        this.carStatus = status;
        notifyObservers(); // Notify all registered observers when status changes
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(carStatus);
        }
    }
}

// 3. Concrete Observers (Dashboard Display and Mobile App)
class DashboardDisplay implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Dashboard Alert: Car status changed to -> " + status);
    }
}

class MobileApp implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Mobile Notification: Warning! Car status is now -> " + status);
    }
}

public class Main {
    public static void main(String[] args) {
        CarTelemetry telemetry = new CarTelemetry();

        // Registering observers
        DashboardDisplay dashboard = new DashboardDisplay();
        MobileApp mobileApp = new MobileApp();

        telemetry.addObserver(dashboard);
        telemetry.addObserver(mobileApp);

        // Changing car status triggers all observers automatically
        System.out.println("--- Changing Status to OVERHEATING ---");
        telemetry.setCarStatus("OVERHEATING");

        System.out.println("\n--- Changing Status to NORMAL ---");
        telemetry.setCarStatus("NORMAL");
    }
}