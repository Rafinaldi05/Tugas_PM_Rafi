import java.util.Scanner;

public class Tugas2SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double nilaiAngka = sc.nextDouble();

        char nilaiHuruf;

        if (nilaiAngka >= 0 && nilaiAngka <= 100) {
            int nilaiBulat = (int) nilaiAngka;
            int digitPertama = nilaiBulat / 10;

            switch (digitPertama) {
                case 10:
				case 9:
                case 8:
                    nilaiHuruf = 'A';
                    break;
                case 7:
                    nilaiHuruf = 'B';
                    break;
                case 6:
                    nilaiHuruf = 'C';
                    break;
                case 5:
                    nilaiHuruf = 'D';
                    break;
                default:
                    nilaiHuruf = 'E';
                    break;
            }
        } else {
            nilaiHuruf = 'X';
        }

        if (nilaiHuruf == 'X') {
            System.out.println("Nilai tidak valid");
        } else {
            System.out.println("Nilai huruf (switch/case): " + nilaiHuruf);
        }
    }
}