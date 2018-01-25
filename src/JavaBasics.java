
public class JavaBasics {

	public static void main(String[] args) {

		final String TEST = "hello";
		// TEST = "no"; we cannot do this - the constant cannot be reassigned.
		// you can declare and initialize separately. e.g. take input from user, assign as constant.
		
		final int TESTINT = 4;
		
		//primitive type declaration
		byte b = 127; 	// max
		short s = 32767;  	// max
		int i = 13333;
		float fl = (float)6.7;
		float flAlt = 6.7f;  // notice the f at the end (can use F)
		double d = 5.6667;
		char  c = 'c';
		boolean bool = true; // default is false
		long l = 12345679101112L;  // notice the L at the end (can use l)
		
		Math.abs(-6); // to see the method, TKTK
		
		// implicit conversion examples
		System.out.println(3.0/1.5);
		// will return a double: 2.0
		System.out.println(3.0/2);
		// will return a double: 1.5
		
		int numOfItems = 5;
		System.out.println((numOfItems + 10) / 2);
		// will return an int: 7
		
		System.out.println((numOfItems + 10) / 2.0);
		// will return a double: 7.5
		
		// explicit casting (type casting)
		double x1 = (3/5);
		double x2 = (double) (3/5); // the division is done BEFORE the cast
		// will return 0.0
		double x3 = (double) 3 / (double) 5;
		// will return 0.6
		System.out.println(x3);
		
		// example 2 -- common error, forgetting to cast
		int kidsInFamily1 = 3;
		int kidsInFamily2 = 4;
		int numOfFamilies = 2;
		
		// double avgKidsPerFamily = (kidsInFamily1 + kidsInFamily2) / numOfFamilies;
		// will return 3.0
				// to get the 
		double avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2) / numOfFamilies;
		//double avgKidsPerFamily = ((double)kidsInFamily1 + kidsInFamily2) / numOfFamilies;
		// both will return 3.5
		
		System.out.println(avgKidsPerFamily);
		
		
	}

}
