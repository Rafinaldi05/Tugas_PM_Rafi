import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
		int angka;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inputkan angka: ");
		angka = sc.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.println(" "+i);
        }
    }
}
