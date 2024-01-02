import java.util.Scanner;

public class uts2S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = {'a', 'b', 'c', 'd', 'e', 'f'};

        int[] inputs = new int[6];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Inputkan data ke " + (i + 1));
            inputs[i] = sc.nextInt();
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println("data ke-" + (i + 1) + ": " + inputs[i] + " - " + (inputs[i] % 2 == 0 ? "Genap" : "Ganjil"));
        }

        int x = 0;
        for (int value : inputs) {
            x += value;
        }
		
		double Ratarata = x/6;

        System.out.println("Total penjumlahan: "+x);
        System.out.println("Ratarata: "+Ratarata);
    }
}
