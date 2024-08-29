package Jobsheet1;

import java.util.Scanner;

public class KalkulatorSederhana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Operand 1: ");
        int operand1 = sc.nextInt();
        System.out.print("Masukkan Operand 2: ");
        int operand2 = sc.nextInt();
        System.out.print("Masukkan Operator(+,-,*,^,%,/): ");
        char operator = sc.next().charAt(0);

        float HasilKalkulasi = Kalkulasi(operator, operand1, operand2);
        System.out.println("Hasilnya adalah: " + HasilKalkulasi);
    }

    static int Kalkulasi(char operator, int operand1, int operand2) {
        int hasil = 0;
        switch (operator) {
            case '^':
                hasil = (int) Math.pow(operand1, operand2);
                break;
            case '%':
                hasil = operand1 % operand2;
                break;
            case '/':
                hasil = operand1 / operand2;
                break;
            case '*':
                hasil = operand1 * operand2;
                break;
            case '-':
                hasil = operand1 - operand2;
                break;
            case '+':
                hasil = operand1 + operand2;
                break;
            default:
                System.out.println("Operasi tidak tersedia!");
        }
        return hasil;
    }
}