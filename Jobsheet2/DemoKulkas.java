package Jobsheet2;

public class DemoKulkas {
    public static void main(String[] args) {
        // Menginstansiasikan dua objek dari class Kulkas
        Kulkas kulkas1 = new Kulkas("Samsung", -5.0, 300);
        Kulkas kulkas2 = new Kulkas("LG", -4.0, 350);

        // Menampilkan informasi awal dari setiap kulkas
        System.out.println("Informasi Kulkas 1:");
        kulkas1.displayInfo();

        System.out.println("\nInformasi Kulkas 2:");
        kulkas2.displayInfo();

        // Mengupdate suhu pendinginan dari setiap kulkas
        kulkas1.setSuhuPendinginan(-6.0);
        kulkas2.setSuhuPendinginan(-5.5);

        // Menampilkan informasi setelah update suhu
        System.out.println("\nInformasi Kulkas 1 setelah update:");
        kulkas1.displayInfo();
        
        System.out.println("\nInformasi Kulkas 2 setelah update:");
        kulkas2.displayInfo();
    }
}