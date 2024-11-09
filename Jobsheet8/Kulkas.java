package Jobsheet8;

public class Kulkas extends AlatElektronik {
    private int jumlahPintu;

    // Konstruktor
    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    // Setter untuk jumlahPintu
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    // Getter untuk jumlahPintu
    public int getJumlahPintu() {
        return jumlahPintu;
    }
}
