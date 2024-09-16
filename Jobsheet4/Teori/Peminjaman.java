package Jobsheet4.Teori;

public class Peminjaman {
    private Buku buku;
    private String tanggalPeminjaman;

    public Peminjaman(Buku buku, String tanggalPeminjaman) {
        this.buku = buku;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public void infoPeminjaman() {
        buku.infoBuku();
        System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman);
    }
}
