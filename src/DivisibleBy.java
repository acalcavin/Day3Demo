import java.util.Scanner;

public class DivisibleBy {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		int userInput;
		
		do {
		
		System.out.println("Enter a number betwee 1 and 100:");
		
		userInput = scnr.nextInt();
		
		if ((userInput % 3) == 0 ) {
			System.out.println("Divisible by 3");
		}
		if ((userInput % 5) == 0) {
			System.out.println("Divisble by 5");
		}
		if ((userInput % 15) == 0) {
			System.out.println("Divisible by 15");
		}
		
		} while((userInput >= 1) && (userInput <= 100));
		
	}

}
