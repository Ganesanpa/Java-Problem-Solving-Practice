package Day12;

public class StaticDemo {
    static int counter = 0;
    int instanceCounter = 0;

    static {
        counter = 100;
        System.out.println("Static block executed: Initializing counter to 100");
    }

    public StaticDemo() {
        counter++;
        instanceCounter++;
        System.out.println("Constructor called: counter = " + counter + ", instanceCounter = " + instanceCounter);
    }

    public static void displayCounter() {
        System.out.println("Static method: counter = " + counter);
    }

    public void displayInstanceCounter() {
        System.out.println("Instance method: instanceCounter = " + instanceCounter + ", counter = " + counter);
    }

    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class: counter = " + counter);
        }
    }

    public static void main(String[] args) {
        System.out.println("Accessing static variable: counter = " + StaticDemo.counter);
        StaticDemo.displayCounter();
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        obj1.displayInstanceCounter();
        obj2.displayInstanceCounter();
        StaticNestedClass nestedObj = new StaticNestedClass();
        nestedObj.display();
        StaticDemo.counter = 200;
        System.out.println("After modifying static counter:");
        StaticDemo.displayCounter();
        obj1.displayInstanceCounter();
        obj2.displayInstanceCounter();
    }
}