import java.util.Scanner;

public class Array {
	
	public static void main (String[] args) {
		int[][] seats = {
				{0, 0, 0, 1, 1, 1, 0},
				{1, 1, 1, 0, 0, 1, 1},
				{0, 1, 1, 0, 0, 0, 1},
				{0, 1, 0, 1, 0, 0, 1},
				{0, 0, 0, 0, 0, 0, 1}
				};
				System.out.println("Choose a seat");
				Scanner sc = new Scanner(System.in);
				System.out.println("Which row : ");
				int row = sc.nextInt();
				System.out.println("Which col: ");
				int col = sc.nextInt();
				
				//HIutngan Array dimulai dari 0
				if (row >= 0 && row < 5 && col >= 0 && col < seats[row].length) {
					if (seats [row][col] == 0) {
						System.out.println("Available");
					} else {
						System.out.println("Taken");
					}
				} else {
					System.out.println("Invalid input");
				}
	}
}