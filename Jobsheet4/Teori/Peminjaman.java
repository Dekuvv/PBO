package Jobsheet4.Teori;

public class Peminjaman {
    private Buku buku;
    private String tanggalPeminjaman;
    private String tanggalPengembalian;

    public Peminjaman(Buku buku, String tanggalPeminjaman) {
        this.buku = buku;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Buku getBuku(){
        return buku;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public String getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void infoPeminjaman() {
        buku.infoBuku();
        System.out.println("Tanggal Peminjaman: " + tanggalPeminjaman);
        System.out.println("Tanggal Pengembalian: " + (tanggalPengembalian != null ? tanggalPengembalian : "Belum dikembalikan"));
    }


}
