package Jobsheet7;

public class Segitiga {

    int sudut;

    // Metode overloading untuk menghitung sudut
    public int totalSudut(int sudutA) {
        // Rumus: sudut = 180 - sudutA
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        // Rumus: sudut = 180 - (sudutA + sudutB)
        return 180 - (sudutA + sudutB);
    }

    // Metode overloading untuk menghitung keliling
    public int keliling(int sisiA, int sisiB, int sisiC) {
        // Rumus: keliling = sisiA + sisiB + sisiC
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        // Rumus: c = √(a^2 + b^2)
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga();

        // Menguji metode overloading totalSudut
        System.out.println("Total Sudut dengan 1 sudut: " + segitiga.totalSudut(90));
        System.out.println("Total Sudut dengan 2 sudut: " + segitiga.totalSudut(60, 30));

        // Menguji metode overloading keliling
        System.out.println("Keliling dengan 3 sisi: " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling dengan 2 sisi (hipotenusa): " + segitiga.keliling(3, 4));
    }
}
