package Jobsheet4.Teori;
import java.util.Scanner;
import java.util.ArrayList;


public class PerpustakaanDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Anggota> anggotaList = new ArrayList<>();
        ArrayList<Buku> bukuList = new ArrayList<>();

        // Membuat objek Buku
        bukuList.add(new Buku("Pemrograman Java", "John Doe", "123"));
        bukuList.add(new Buku("Struktur Data", "Jane Smith", "987"));
        bukuList.add(new Buku("Algoritma Pemrograman", "Alice Johnson", "555"));

        // Membuat objek Anggota
        Anggota anggota1 = new Anggota("Adit Bagus", "TI001");

        // Menambahkan peminjaman ke anggota
    int pilihan;
    do {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Tambah Anggota");
        System.out.println("2. Peminjaman Buku");
        System.out.println("3. Pengembalian Buku");
        System.out.println("4. Tampilkan Anggota dan Buku yang Dipinjam");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                sc.nextLine();
                System.out.println("\n--- Tambah Anggota Baru ---");
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("ID Anggota: ");
                String idAnggota = sc.nextLine();
                
                Anggota anggotaBaru = new Anggota(nama, idAnggota);
                anggotaList.add(anggotaBaru);
                System.out.println("Anggota " + nama + " berhasil ditambahkan.");
                break;
            case 2:
                    System.out.println("\n--- Peminjaman Buku ---");
                    sc.nextLine();
                    System.out.println("ID Anggota : ");
                    String idAnggotaPeminjaman = sc.nextLine();
                    Anggota anggotaPinjam = cariAnggota(anggotaList, idAnggotaPeminjaman);
                    
                    if (anggotaPinjam != null) {
                        System.out.println("Pilih Buku yang akan Dipinjam:");
                        for (int i = 0; i < bukuList.size(); i++) {
                            System.out.println((i + 1) + ". " + bukuList.get(i).getJudul() + " (ISBN: " + bukuList.get(i).getIsbn() + ")");
                        }
                        int pilihanBuku = sc.nextInt();
                        sc.nextLine(); // Tangani "newline"
                        
                        if (pilihanBuku > 0 && pilihanBuku <= bukuList.size()) {
                            Buku bukuDipinjam = bukuList.get(pilihanBuku - 1);
                            System.out.print("Tanggal Peminjaman (dd/mm/yyyy): ");
                            String tanggalPeminjaman = sc.nextLine();
                            Peminjaman peminjaman = new Peminjaman(bukuDipinjam, tanggalPeminjaman);
                            anggotaPinjam.tambahPeminjaman(peminjaman);
                            System.out.println("Buku " + bukuDipinjam.getJudul() + " berhasil dipinjam.");
                        } else {
                            System.out.println("Pilihan buku tidak valid.");
                        }
                    } else {
                        System.out.println("Anggota dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                    
                case 3:
                    // Pengembalian buku
                    System.out.println("\n--- Pengembalian Buku ---");
                    sc.nextLine();
                    System.out.println("ID Anggota: ");
                    String idAnggotaPengembalian = sc.nextLine();
                    Anggota anggotaKembali = cariAnggota(anggotaList, idAnggotaPengembalian);
                    
                    if (anggotaKembali != null) {
                        anggotaKembali.infoAnggota(); // Tampilkan daftar buku yang dipinjam
                        System.out.print("Masukkan ISBN buku yang akan dikembalikan: ");
                        String isbnPengembalian = sc.nextLine();
                        Buku bukuPengembalian = cariBuku(bukuList, isbnPengembalian);
                        
                        if (bukuPengembalian != null) {
                            anggotaKembali.kembalikanBuku(bukuPengembalian);
                        } else {
                            System.out.println("Buku dengan ISBN tersebut tidak ditemukan.");
                        }
                    } else {
                        System.out.println("Anggota dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                    
                case 4:
                    // Tampilkan daftar anggota dan buku yang dipinjam
                    System.out.println("\n--- Daftar Anggota dan Buku yang Dipinjam ---");
                    for (Anggota anggota : anggotaList) {
                        anggota.infoAnggota();
                    }
                    break;
                    
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 5);
    }

    public static Anggota cariAnggota(ArrayList<Anggota> anggotaList, String idAnggota) {
        for (Anggota anggota : anggotaList) {
            if (anggota.getIdAnggota().equals(idAnggota)) {
                return anggota;
            }
        }
        return null;
    }
    
    // Fungsi untuk mencari buku berdasarkan ISBN
    public static Buku cariBuku(ArrayList<Buku> bukuList, String isbn) {
        for (Buku buku : bukuList) {
            if (buku.getIsbn().equals(isbn)) {
                return buku;
            }
        }
        return null;
    }
}
