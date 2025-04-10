public class Main {
    public static void main(String[] args) {

    /* 
     *  Method overriding = When a subclass provides its own implementation
     * of a method that is very defined allows for code reusability and give
     * specific implementations
     */
  
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        cat.move();
        dog.move();
        fish.move();
    }
}
