public class Main {
    public static void main(String[] args) {

        // constuctor  = A special method to initialize object
        //               you can pass agrument to constructor
        //               and  set up initial values

        Student student = new Student("Allen", 25, 2);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);
        System.out.println(student.isEnrolled);
    }
}
