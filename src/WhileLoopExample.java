import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) { // as long as cont is y, will exec. at least once
			// your code should start here. For example:
			
			System.out.println("Stuff");

			// This is where your code should end.
			System.out.println("Do you want to continue? (y/n)");
			cont = scnr.nextLine();
			
		} 
		
		// let the user know the program has closed
		System.out.println("Goodbye!");
		
		scnr.close();
		
	}

}
