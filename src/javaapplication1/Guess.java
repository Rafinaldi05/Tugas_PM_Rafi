4import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
public class Guess {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int numGuesses = 0;
		int randomNumber = new Random().nextInt(10) + 1;

		out.println(" **** ");
		out.println("Welcome to the Guessing Game");
		out.println(" **** ");
		out.println();

		out.print("Enter an int from 1 to 10: ");
		int inputNumber = sc.nextInt();
		numGuesses++;

		while (inputNumber != randomNumber) {
			out.println();
			out.println("Try again...");
			out.print("Enter an int from 1 to 10: ");
			inputNumber = sc.nextInt();
			numGuesses++;
		}
		out.print("You win after ");
		out.println(numGuesses + " guesses.");
		
		sc.close();
	}
}