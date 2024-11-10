package Jobsheet8;

public class TV extends AlatElektronik implements Audible {
    private String jenisPlayer;
    private int volume;

    public TV(String jenisPlayer, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisPlayer = jenisPlayer;
        this.volume = volume;
    }

    public String getJenisPlayer() {
        return jenisPlayer;
    }

    public void setJenisPlayer(String jenisPlayer) {
        this.jenisPlayer = jenisPlayer;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
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

    // Method getInfo
    public String getInfo() {
        return "=== TV ===\n" +
               "Jenis Player: " + jenisPlayer + "\n" +
               "Volume: " + volume + "\n" +
               "Merk: " + getMerk() + "\n" +
               "Warna: " + getWarna() + "\n" +
               "Harga: Rp" + getHarga();
    }
}
