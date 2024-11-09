public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, int employeeId, double salary, String department) {
        super(name, age, employeeId, salary); // Memanggil konstruktor dari kelas Employee
        this.department = department;
    }

    public void displayManagerInfo() {
        super.displayEmployeeInfo(); // Memanggil method dari Employee
        System.out.println("Department: " + department);
    }
}
