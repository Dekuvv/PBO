package Jobsheet3;

public class TestKoperasi {
    public static void main(String[] args) {
        // Instansiasi Objek
        Anggota anggotal = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + anggotal.getNama());
        System.out.println("Limit Pinjaman: " + anggotal.getLimitPeminjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggotal.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        anggotal.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        anggotal.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000");
        anggotal.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 5.000.000...");
        anggotal.pinjam(5000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 10.000");
        anggotal.angsur(10000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 500.000");
        anggotal.angsur(500000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 2.500.000");
        anggotal.angsur(2500000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 2.000.000");
        anggotal.angsur(2000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggotal.getJumlahPinjaman());
    }
}