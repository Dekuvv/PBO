package Jobsheet2;

public class DemoPersegi {
    public static void main(String[] args) {
        // Membuat objek PersegiPanjang
        PersegiPanjang persegi = new PersegiPanjang(5, 3);

        // Menampilkan informasi persegi panjang
        persegi.displayInfo();

        // Menghitung dan menampilkan luas
        int luas = persegi.getLuas();
        System.out.println("Luas      : " + luas);

        // Menghitung dan menampilkan keliling
        int keliling = persegi.getKeliling();
        System.out.println("Keliling  : " + keliling);
    }
}
