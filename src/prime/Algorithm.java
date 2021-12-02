package prime;
import java.util.Random;

/**
* Sieve of Eratosthenes 
* @author Ansor Kasimov
* @version 2.0
*/

public class Algorithm {

	// Min num
	private final int MIN = 10;
	// Max min
	private final int MAX = 1000;
	// Last term
	private int n;
	// Keep track of primes
	private boolean p[];
	// Display output
	private String output;
	
	// Default constructor
	public Algorithm() {
		// random number between 10 and 1000
		n = new Random().nextInt(MAX - MIN + 1) + MIN;
		p = new boolean[n];
	}
	
	/**
	* Paramerized constructor
	* @param User defined input
	*/
	public Algorithm(int n) {
		this.n = n;
		p = new boolean[n];
	}
	
	/** 
	* @return n
	*/
	public int getN() {
		return n;
	}
	
	// Sift out number with more than 2 factors (1 and itself)
	private void sift() {
		// Set all booleans to true
		for (int i = 0; i < n; i++) 
			p[i] = true;
		// Sift out values greater than square of n
		for (int i = 2; i < Math.sqrt(n); i++) 
			if (p[i] == true) 
				// Sift out values that are factors of i
				for (int j = (i * i); j < n; j += i)
					p[j] = false;
	}
	
	// Display prime numbers from 2 to n
	public String toString() {
		sift();
		output = "";
		for (int i = 2; i < n; i++) 
			if (p[i] == true)
				output += i + ", ";
		output = output.replaceAll(", $", "");
		return "\nPrime Number in the range 2 to " + n + ":\n" + output;
	}
	
}
