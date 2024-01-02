import java.util.Scanner;
public class For2  {
public static void main (String [] args) {
  int maksi;
  int maksiawal = 1;
System.out.println("Program deret bilangan ganjil");
Scanner sc = new Scanner (System.in);
System.out.print("Masukkan angka maksimal : ");
  maksi = sc.nextInt();
  for (maksiawal=1; maksiawal<=maksi; maksiawal+=2)
  System.out.println(" " +maksiawal);
}
}