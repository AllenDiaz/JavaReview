public class Student extends Person{

    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println("Your GPA is" + gpa);
    }
}
