public class Main {
    public static void main(String[] args) {

        /* 
         * Polymorphism = "Poly" = "Many"
         *                 "Morph" = "Shape"
         *                 Object can identify as other objects.
         *                 Object can be treated as objects of a common superclass
         */

         Bike bike = new Bike();
         Car car = new Car();
         Boat boat = new Boat();
        
        //  car.go();
        //  bike.go();
        //  boat.go();

         Vehicle[] vehicles = {car, bike, boat};

         for(Vehicle vehicle : vehicles) {
            vehicle.go();
         }
        }
}
