package Jobsheet8;

public class ElektronikMain {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Dinding", 150000, "Putih", "Panasonic");
        Kulkas kulkas = new Kulkas(2, 3000000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(5, 2, 7500000, "Hitam", "Samsung");
        TV tv = new TV("LCD", 10, 2000000, "Hitam", "Sony");

        System.out.println(kipas.getInfo());
        System.out.println("\n" + kulkas.getInfo());
        System.out.println("\n" + smartFridge.getInfo());
        System.out.println("\n" + tv.getInfo());
    }
}
