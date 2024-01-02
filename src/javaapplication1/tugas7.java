import java.util.Scanner;
public class tugas7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Jumlah data: ");
        int jumlahData = sc.nextInt();

        
        int[] data = new int[jumlahData];

        
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + i + ": ");
            data[i] = sc.nextInt();
        }

       
        System.out.println("Menampilkan data");
        int totalPenjumlahan = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + "-> ");
            if (data[i] % 2 == 0) {
                System.out.println("GENAP");
            } else {
                System.out.println("GANJIL");
            }
            totalPenjumlahan += data[i];
        }
		
		double Ratarata = totalPenjumlahan/jumlahData;
      
        System.out.println("Total Penjumlahan: " + totalPenjumlahan);
        System.out.println("Ratarata: " + Ratarata);

	}  
}