public class Employee extends Person {
    protected int employeeId;
    protected double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age); // Memanggil konstruktor dari kelas Person
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        super.displayPersonInfo(); // Memanggil method dari Person
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}