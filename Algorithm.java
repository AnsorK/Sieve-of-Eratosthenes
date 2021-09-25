import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		input.close();
		boolean p[] = new boolean[n];
		for (int i = 0; i < n; i++) 
			p[i] = true;
		String output = "";
		
		for (int i = 2; i < Math.sqrt(n); i++) 
			if (p[i] == true) 
				for (int j = (i * i); j < n; j += i)
					p[j] = false;
			
		System.out.println("\n" + "Prime Numbers in the range 2 to " + n + ": ");
		for (int i = 2; i < n; i++) 
			if (p[i] == true)
				output += i + ", ";
		
		output = output.replaceAll(", $", "");
		System.out.println(output);
		
	}

}
