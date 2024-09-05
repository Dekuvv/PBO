package Jobsheet2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Adit Bagus";
        m1.alamat = "Batu, Jawa timur";
        m1.kelas = "2D";

        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Vidi Josub";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2F";

        m2.displayBiodata();
    }
}
