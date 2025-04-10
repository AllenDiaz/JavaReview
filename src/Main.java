public class Main {
    public static void main(String[] args) {

    /* 
     * Super = Refers to the parent class ( subclass <- superclass)
     * used in constructor and method overriding 
     * calls the parent constructor to initialize attributes
     */
    Person person = new Person("Allen", "Diaz");
    Student student = new Student("Allen", "Diaz", 5);      
    Employee employee = new Employee("Lebron", "James", 1);

    person.showName();
    student.showGPA();
    employee.showSalary();

    }
}
