package Jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.platNomor = "B 0838 XZ";
        motor1.displayStatus();

        motor1.isMesinOn = true;  // Hidupkan mesin terlebih dahulu
        motor1.setKecepatan(120); // Coba atur kecepatan lebih dari 100
        motor1.displayStatus();

        Motor motor2 = new Motor();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        motor2.setKecepatan(80);  // Kecepatan di bawah 100
        motor2.displayStatus();

        Motor motor3 = new Motor();
        motor3.platNomor = "D 8343 CV";
        motor3.setKecepatan(50);  // Mesin mati, tidak bisa atur kecepatan
        motor3.displayStatus();
    }
}
