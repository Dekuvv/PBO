package Jobsheet2;

public class Kulkas {
    // Atribut dari class Kulkas
    private String merk;
    private double suhuPendinginan;
    private int kapasitas;

    // Constructor untuk inisialisasi atribut
    public Kulkas(String merk, double suhuPendinginan, int kapasitas) {
        this.merk = merk;
        this.suhuPendinginan = suhuPendinginan;
        this.kapasitas = kapasitas;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Suhu Pendinginan: " + suhuPendinginan + "°C");
        System.out.println("Kapasitas: " + kapasitas + " liter");
    }

    // Method untuk set suhu pendinginan
    public void setSuhuPendinginan(double suhu) {
        this.suhuPendinginan = suhu;
    }

    // Method untuk get suhu pendinginan
    public double getSuhuPendinginan() {
        return suhuPendinginan;
    }
}
