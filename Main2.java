public class Main2 {
    public static void main(String[] args) {
        // Membuat objek Manager
        Manager manager = new Manager("Adit Bagus", 20, 101, 75000.50, "IT Department");

        // Menampilkan semua informasi yang diwarisi dari Person, Employee, dan Manager
        System.out.println("===== Manager Info =====");
        manager.displayManagerInfo();
    }
}