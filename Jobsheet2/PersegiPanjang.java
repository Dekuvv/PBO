package Jobsheet2;

public class PersegiPanjang {
    // Atribut panjang dan lebar
    private int panjang;
    private int lebar;

    // Constructor
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menampilkan informasi panjang dan lebar
    public void displayInfo() {
        System.out.println("Panjang   : " + panjang);
        System.out.println("Lebar     : " + lebar);
    }

    // Method untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}