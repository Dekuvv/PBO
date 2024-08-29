package Jobsheet1;

import java.util.Scanner;

public class MobilStruktural {
    
    public static int jalan(int kecepatanAwal, int penambahan) {
        return kecepatanAwal + penambahan;
    }
    
    public static int berhenti() {
        return 0;
    }
    
    public static void main(String[] args) {
        String mobil1_warna = "merah";
        int mobil1_kecepatan = 0;
        String mobil1_merk = "Toyota";
        
        String mobil2_warna = "biru";
        int mobil2_kecepatan = 0;
        String mobil2_merk = "Honda";
        
        String mobil3_warna = "hitam";
        int mobil3_kecepatan = 0;
        String mobil3_merk = "Ford";
        
        String mobil4_warna = "putih";
        int mobil4_kecepatan = 0;
        String mobil4_merk = "BMW";
        
        String mobil5_warna = "silver";
        int mobil5_kecepatan = 0;
        String mobil5_merk = "Mercedes";
        
        String mobil6_warna = "kuning";
        int mobil6_kecepatan = 0;
        String mobil6_merk = "Chevrolet";
        
        String mobil7_warna = "hijau";
        int mobil7_kecepatan = 0;
        String mobil7_merk = "Nissan";
        
        String mobil8_warna = "oranye";
        int mobil8_kecepatan = 0;
        String mobil8_merk = "Lamborghini";
        
        String mobil9_warna = "coklat";
        int mobil9_kecepatan = 0;
        String mobil9_merk = "Kia";
        
        String mobil10_warna = "abu-abu";
        int mobil10_kecepatan = 0;
        String mobil10_merk = "Hyundai";
        
        // Mobil 1 dan mobil 2 jalan
        mobil1_kecepatan = jalan(mobil1_kecepatan, 60);
        mobil2_kecepatan = jalan(mobil2_kecepatan, 80);
        
        // Mobil 3 berhenti
        mobil3_kecepatan = berhenti();
        
        // Menampilkan status kecepatan mobil
        System.out.println("Kecepatan mobil 1: " + mobil1_kecepatan + " km/h");
        System.out.println("Kecepatan mobil 2: " + mobil2_kecepatan + " km/h");
        System.out.println("Kecepatan mobil 3: " + mobil3_kecepatan + " km/h");
    }
}