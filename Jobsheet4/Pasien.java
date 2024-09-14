package Jobsheet4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    // Atribut untuk menyimpan nomor rekam medis pasien
    private String noRekamMedis;

    // Atribut untuk menyimpan nama pasien
    private String nama;

    // ArrayList untuk menyimpan riwayat konsultasi pasien (relasi dengan class Konsultasi)
    private ArrayList<Konsultasi> riwayatKonsultasi;

    // Method untuk mendapatkan nomor rekam medis pasien
    public String getNoRekamMedis(){
        return noRekamMedis;
    }

    // Method untuk mengatur nomor rekam medis pasien
    public void setNoRekammedis(String noRekamMedis){
        this.noRekamMedis = noRekamMedis;
    }

    // Method untuk mendapatkan nama pasien
    public String getNama(){
        return nama;
    }

    // Method untuk mengatur nama pasien
    public void setNama(String nama){
        this.nama = nama;
    }

    // Method untuk menambahkan sesi konsultasi baru ke dalam riwayat pasien
    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat){
        // Membuat objek Konsultasi baru
        Konsultasi konsultasi = new Konsultasi();
        
        // Mengatur tanggal, dokter, dan perawat untuk sesi konsultasi
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);

        // Menambahkan objek konsultasi ke dalam ArrayList riwayatKonsultasi
        riwayatKonsultasi.add(konsultasi);
    }

    // Constructor berparameter untuk menginisialisasi nomor rekam medis, nama, dan ArrayList riwayat konsultasi
    public Pasien(String noRekamMedis, String nama){
        this.noRekamMedis = noRekamMedis; // Inisialisasi nomor rekam medis
        this.nama = nama;                 // Inisialisasi nama pasien
        this.riwayatKonsultasi = new ArrayList<Konsultasi>(); // Inisialisasi ArrayList kosong untuk riwayat konsultasi
    }

    // Method untuk mendapatkan informasi lengkap tentang pasien, termasuk riwayat konsultasi
    public String getInfo(){
        String info = ""; // Menyimpan informasi pasien
        
        // Menambahkan informasi nomor rekam medis dan nama ke dalam string info
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
        info += "Nama               : " + this.nama + "\n";
        
        // Mengecek apakah pasien memiliki riwayat konsultasi
        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";
            
            // Loop melalui setiap objek Konsultasi dalam riwayatKonsultasi dan menambahkan informasi tiap konsultasi
            for (Konsultasi konsultasi : riwayatKonsultasi){
                info += konsultasi.getInfo(); // Memanggil getInfo() dari objek Konsultasi untuk mendapatkan detailnya
            }
        } else {
            info += "Belum ada riwayat konsultasi"; // Jika tidak ada riwayat konsultasi
        }
        
        info += "\n"; // Menambahkan baris baru setelah informasi

        return info; // Mengembalikan string yang berisi semua informasi pasien
    }
}
