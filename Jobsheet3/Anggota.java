package Jobsheet3;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    public Anggota(String noKTP, String nama, int limitPeminjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlah > 0) {
            if ((jumlahPinjaman + jumlah) <= limitPeminjaman) {
                jumlahPinjaman += jumlah;
            } else {
                System.out.println("Maaf, jumlah pinjaman melebihi limit.");
            }
        } else {
            System.out.println("Jumlah pinjaman harus lebih besar dari 0.");
        }
    }

    public void angsur(int jumlah) {
        if (jumlah > 0) {
            if (jumlah >= jumlahPinjaman * 0.1) {
                jumlahPinjaman -= jumlah;
            } else {
                System.out.println("Angsuran harus minimal 10% dari jumlah pinjaman.");
            }
        } else {
            System.out.println("Jumlah angsuran harus lebih besar dari 0.");
        }
    }
}