package Jobsheet3;

public class Motor {
    public String platNomor;
    public boolean isMesinOn;
    private int kecepatan;
    private int KECEPATAN_MAKSIMAL = 100;

    // Setter untuk mengatur kecepatan dengan batas maksimal 100 dan validasi negatif
    public void setKecepatan(int kecepatanBaru) {
        if (isMesinOn) {
            if (kecepatanBaru > KECEPATAN_MAKSIMAL) {
                System.out.println("Kecepatan tidak boleh melebihi " + KECEPATAN_MAKSIMAL + " km/jam");
                this.kecepatan = KECEPATAN_MAKSIMAL;
            } else if (kecepatanBaru < 0) {
                System.out.println("Kecepatan tidak boleh kurang dari 0 km/jam");
                this.kecepatan = 0; // Menetapkan kecepatan ke 0 jika input negatif
            } else {
                this.kecepatan = kecepatanBaru;
            }
        } else {
            System.out.println("Mesin dalam keadaan mati, kecepatan tidak bisa diatur");
        }
    }

    // Getter untuk kecepatan
    public int getKecepatan() {
        return this.kecepatan;
    }

    // Method untuk menampilkan status motor
    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);
        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("======================");
    }
}
