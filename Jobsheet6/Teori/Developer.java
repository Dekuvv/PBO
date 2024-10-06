package Jobsheet6.Teori;

public class Developer extends Karyawan {
    String programmingLanguage;
    int experienceYears;

    public Developer(String name, int id, String department, String programmingLanguage, int experienceYears) {
        super(name, id, department); // memanggil parent class construktor
        this.programmingLanguage = programmingLanguage;
        this.experienceYears = experienceYears;
    }

    // Method untuk display informasi developer
    public void displayDeveloperInfo() {
        displayInfo(); // memanggil parent class method
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Years of Experience: " + experienceYears);
    }
}
