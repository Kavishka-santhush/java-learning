import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// 1. Creating a Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CarInfo {
    String project();
    int version() default 1;
}

// 2. Class using the Custom Annotation
class SmartCar {
    @CarInfo(project = "Autonomous Driving", version = 2)
    public void startAPU() {
        System.out.println("APU started successfully.");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartCar car = new SmartCar();

        try {
            // 3. Using Reflection to inspect annotations at runtime
            Method method = car.getClass().getMethod("startAPU");
            
            if (method.isAnnotationPresent(CarInfo.class)) {
                CarInfo info = method.getAnnotation(CarInfo.class);
                System.out.println("Annotation Data Found -> Project: " + info.project() + ", Version: " + info.version());
            }

            // Invoking the method using reflection
            method.invoke(car);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}