package Jobsheet8;

public class Kipas extends AlatElektronik {
    private String jenis;

    // Konstruktor
    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    // Getter untuk jenis
    public String getJenis() {
        return jenis;
    }

    // Setter untuk jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}

