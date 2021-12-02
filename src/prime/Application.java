package prime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Algorithm example = new Algorithm();
		System.out.println("Example with random number: " + example.getN());
		System.out.println(example + "\n");
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		try {
			input = sc.nextInt();
			sc.close();
			Algorithm test = new Algorithm(input);
			System.out.println(test);
		} catch (InputMismatchException ime) {
			sc.close();
			System.out.println("\nNot a valid number");
		}
		
	}

}
