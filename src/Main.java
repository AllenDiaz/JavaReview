public class Main {
    public static void main(String[] args) {

    /* 
     *  abstract = Used to define abstract classses and methods.
     * Abstraction is the process of hiding implementation details
     * and showing only essential features;
     * Abstract classes CAN'T be instantiated directly
     * Can contain 'abstract' methods (which must be implemented)
     * Can contain 'concrete' methods (which are inheritated)
     *  
     */

    // Shape shape = new Shape(); //since shape is abstract can't create a object ofshape

    Circle circle = new Circle(3);
    Triangle triangle = new Triangle(4, 5);
    Rectangle rectangle = new Rectangle(6, 7);

    System.out.println(circle.area());
    System.out.println(triangle.area());
    System.out.println(rectangle.area());

    }
}
