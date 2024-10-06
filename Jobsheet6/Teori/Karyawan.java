package Jobsheet6.Teori;

public class Karyawan {
    String name;
    int id;
    String department;

    public Karyawan(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Method untuk display karyawan
    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}