// 1. Defining an Enum for Car Status
enum CarStatus {
    AVAILABLE, RUNNING, UNDER_MAINTENANCE
}

// 2. Singleton Class (Only one instance can be created)
class DatabaseConnection {
    // Private static instance
    private static DatabaseConnection instance;

    // Private constructor so no one can use 'new DatabaseConnection()' outside
    private DatabaseConnection() {
        System.out.println("Database Connection Established!");
    }

    // Public method to get the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}

public class Main {
    public static void main(String[] args) {
        // Testing Singleton
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM cars");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        // Checking if both references point to the exact same object in memory
        System.out.println("Are both db1 and db2 the same instance? " + (db1 == db2));

        // Testing Enum
        CarStatus status = CarStatus.RUNNING;
        System.out.println("Current Car Status: " + status);
    }
}