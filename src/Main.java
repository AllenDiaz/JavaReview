public class Main {
    public static void main(String[] args) {

    /* 
     * .toString() = Method inherited from the Object class.
     *  used to return a string representation of an object .
     *  By default, it returns a hash code as a unique identifier.
     *  It can be overriden to provide meaningful details
     */

     Car car = new Car("Ford", "Mustang", 2025, "Red");

     System.out.println(car);
    }
}
