import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {

		// 18+ can vote
		// 16 - 17 send to voter education
		// <16 research
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Hey user, please enter your age: ");
		int age = scnr.nextInt();
		
		if (age >= 18) {
			System.out.println("You can legally vote!");
		}
		//else if ((age >= 16) && (age < 18)) {  // NOTE: the second condition is not necessary
		else if (age >= 16) {
			System.out.println("Sorry, not old enough. But go check out some voter education classes!");
		}
		else { // NOTE: else does NOT take a condition
			System.out.println("Please do some research!");
		}
		
		scnr.close();
		
	}

}
