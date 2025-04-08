public class Main {
    public static void main(String[] args) {

     Car car1 = new Car("Mustang", "Red");
     Car car2 = new Car("Honda", "Green");
     Car car3 = new Car("Corvette", "Blue");

     Car[] cars = {car1, car2, car3};

    for (Car car : cars){
        car.color = "black";
    }

    for (Car car : cars){
        car.drive();
    }
    }
}
