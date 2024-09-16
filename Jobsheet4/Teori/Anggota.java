package Jobsheet4.Teori;

import java.util.ArrayList;

public class Anggota {
    private String nama;
    private String idAnggota;
    private ArrayList<Peminjaman> peminjamanList;  // ArrayList of Peminjaman objects

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.peminjamanList = new ArrayList<>(); // Inisialisasi ArrayList
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void tambahPeminjaman(Peminjaman peminjaman) {
        peminjamanList.add(peminjaman);
    }

    public void infoAnggota() {
        System.out.println("Anggota: " + nama + " (ID: " + idAnggota + ")");
        System.out.println("Daftar Peminjaman:");
        for (Peminjaman pem : peminjamanList) {
            pem.infoPeminjaman();
        }
    }
}

