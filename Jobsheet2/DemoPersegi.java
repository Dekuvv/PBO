package Jobsheet2;

public class DemoPersegi {
    public static void main(String[] args) {
        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);

        // Menampilkan informasi persegi panjang
        persegiPanjang.displayInfo();

        // Menghitung dan menampilkan luas
        int luas = persegiPanjang.getLuas();
        System.out.println("Luas      : " + luas);

        // Menghitung dan menampilkan keliling
        int keliling = persegiPanjang.getKeliling();
        System.out.println("Keliling  : " + keliling);
    }
}
