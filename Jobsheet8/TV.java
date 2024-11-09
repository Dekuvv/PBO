package Jobsheet8;

public class TV extends AlatElektronik implements Audible {
    private String jenisPlayer;
    private int volume;

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

    public TV(String jenisPlayer, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisPlayer = jenisPlayer;
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
}