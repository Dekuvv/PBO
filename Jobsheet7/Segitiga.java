package Jobsheet7;

public class Segitiga {

    int sudut;

    // Metode overloading untuk menghitung sudut
    public int totalSudut(int sudutA) {

        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {

        return 180 - (sudutA + sudutB);
    }

    // Metode overloading untuk menghitung keliling
    public int keliling(int sisiA, int sisiB, int sisiC) {

        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        // Rumus: c = √(a^2 + b^2)
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {

        Segitiga segitiga = new Segitiga();


        System.out.println("Total Sudut dengan 1 sudut: " + segitiga.totalSudut(90));
        System.out.println("Total Sudut dengan 2 sudut: " + segitiga.totalSudut(60, 30));


        System.out.println("Keliling dengan 3 sisi: " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling dengan 2 sisi (hipotenusa): " + segitiga.keliling(3, 4));
    }
}
