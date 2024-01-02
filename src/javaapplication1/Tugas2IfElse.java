import java.util.Scanner;

public class Tugas2IfElse {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inputkan nilai angka: ");
        double nilaiAngka = sc.nextDouble();

        String nilaiHuruf;
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAngka >= 70 && nilaiAngka <= 79.99) {
            nilaiHuruf = "B";
        } else if (nilaiAngka >= 60 && nilaiAngka <= 69.99) {
            nilaiHuruf = "C";
        } else if (nilaiAngka >= 50 && nilaiAngka <= 59.99) {
            nilaiHuruf = "D";
        } else if (nilaiAngka >= 0 && nilaiAngka <= 49.99) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Nilai tidak valid";
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}