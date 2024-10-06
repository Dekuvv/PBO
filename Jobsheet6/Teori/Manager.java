package Jobsheet6.Teori;

public class Manager extends Karyawan {
    int teamSize;
    String projectName;

    // Constructor
    public Manager(String name, int id, String department, int teamSize, String projectName) {
        super(name, id, department); // Call the parent class constructor
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Method to display manager information
    public void displayManagerInfo() {
        displayInfo(); // Memanggil parent class method
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName); 
    }
}