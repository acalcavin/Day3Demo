import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		int caseSwitch = 2;
		switch (caseSwitch) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default case");
			break;
		}

		int caseSwitch2 = 1;
		switch (caseSwitch2) {
		case 1:
		case 3:
		case 5:
			System.out.println("Case 1, 3, or 5");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		default:
			System.out.println("Default case");
			break;
		}

		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a grade: ");
		double grade = scnr.nextDouble();

		// switch (grade) { // can't use a double in a switch
		switch ((int) grade / 10) { // NOTE: This divides by 10, casts as int, to get a 1, 2, 3, ...
		case 1:
			System.out.println("10 - 19");
			break;
		case 2:
			System.out.println("20 - 29");
			break;
		case 3:
			System.out.println("30 - 39");
			break;
		default:
			System.out.println("Your number did not match.");
		}
		System.out.println("Goodbye");

	}

}
