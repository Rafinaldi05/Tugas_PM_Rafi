import java.util.Scanner;

public class While2 {
  public static void main(String[] args) {
    int maksi;
    int maksiawal = 1;
    System.out.println("Program deret bilangan ganjil");
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka maksimal : ");
    maksi = sc.nextInt();
    while (maksiawal <= maksi) {
      System.out.println(" " + maksiawal);
      maksiawal += 2;
    }
  }
}