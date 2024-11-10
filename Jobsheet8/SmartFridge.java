package Jobsheet8;

public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        volume -= decrement;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Method getInfo
    public String getInfo() {
        return "=== Smart Fridge ===\n" +
               "Volume: " + volume + "\n" +
               "Jumlah Pintu: " + getJumlahPintu() + "\n" +
               "Merk: " + getMerk() + "\n" +
               "Warna: " + getWarna() + "\n" +
               "Harga: Rp" + getHarga();
    }
}
