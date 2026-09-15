// Generic Class with type parameter 'T'
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) { 
        // 1. Creating a Box for Strings
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Electric Car Battery");
        System.out.println("String Box contains: " + stringBox.getItem());

        // 2. Creating a Box for Integers
        Box<Integer> intBox = new Box<>();
        intBox.setItem(5000);
        System.out.println("Integer Box contains: " + intBox.getItem());
    }
}