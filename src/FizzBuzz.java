/*
 * For numbers 1-100, 
 * if divisible by 3, print Fizz
 * if divisible by 5, print Buzz
 * if divisible by 15, print FizzBuzz
 */


public class FizzBuzz {

	public static void main(String[] args) {
		// note: divisible by 15: 15, 30, 45, 60, 75, 90
		
		int i;
		
		for (i = 1; i <= 100; ++i) {
			
			if (i % 15 == 0) {
				System.out.println(i + " FizzBuzz!");
			}
			else if (i % 5 == 0) {
				System.out.println(i + " Buzz");
			}
			else if (i % 3 == 0) {
				System.out.println(i + " Fizz");
			}
			else {
				System.out.println(i);
			}
		}
		
	}

}
