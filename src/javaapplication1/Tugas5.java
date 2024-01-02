import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inputkan alas jajargenjang: ");
        double alas = sc.nextDouble();
        System.out.print("Inputkan tinggi jajargenjang: ");
        double tinggi = sc.nextDouble();

        double luas = alas * tinggi;

        System.out.println("Luas jajargenjang: " + luas);
    }
}
