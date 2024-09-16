package Jobsheet4.Teori;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Buku("Pemrograman Java", "James Gosling", "978-1234567890");
        Buku buku2 = new Buku("Pemrograman Python", "Guido van Rossum", "978-0987654321");

        // Membuat objek Anggota
        Anggota anggota1 = new Anggota("Andi", "AG001");

        // Membuat objek Peminjaman
        Peminjaman peminjaman1 = new Peminjaman(buku1, "2024-09-16");
        Peminjaman peminjaman2 = new Peminjaman(buku2, "2024-09-17");

        // Menambahkan peminjaman ke anggota
        anggota1.tambahPeminjaman(peminjaman1);
        anggota1.tambahPeminjaman(peminjaman2);

        // Menampilkan informasi anggota dan daftar peminjaman
        anggota1.infoAnggota();
    }
}
