public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false; 

    void start() {
        isRunning = true;
        System.out.println("Starting the car");
    }

    void stop() {
        isRunning = false;
        System.out.println("The car was stop");
    }
}
