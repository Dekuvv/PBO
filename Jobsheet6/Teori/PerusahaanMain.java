package Jobsheet6.Teori;

public class PerusahaanMain {
    public static void main(String[] args) {
        // membuat objek manager
        Manager manager = new Manager("Adit Bagus", 101, "Sales", 10, "Project X");
        System.out.println("Manager Info:");
        manager.displayManagerInfo();

        // membuat objek baru developer
        Developer developer = new Developer("Vidi Josubzky", 102, "IT", "Java", 5);
        System.out.println("\nDeveloper Info:");
        developer.displayDeveloperInfo();
    }
}