package Jobsheet7;

public class Maintgs {
    public static void main(String[] args) {
        // Menggunakan referensi kelas induk untuk objek subclass (dynamic dispatch)
        Manusia manusia;

        // Objek Dosen
        manusia = new Dosen();
        manusia.bernapas(); // memanggil method dari kelas Manusia
        manusia.makan();    // memanggil method yang dioverride oleh Dosen

        // Objek Mahasiswa
        manusia = new Mahasiswa();
        manusia.bernapas(); // memanggil method dari kelas Manusia
        manusia.makan();    // memanggil method yang dioverride oleh Mahasiswa

        // Jika ingin mengakses method khusus subclass, kita perlu melakukan casting
        Dosen dosen = new Dosen();
        dosen.lembur();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tidur();
    }
}
