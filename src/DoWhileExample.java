
public class DoWhileExample {

	public static void main(String[] args) {

		int i = 1;
		int month = 36;
		double futureValue = 0;
		double monthlyPayment = 330.63;
		double intRate = 5.99/100;
		
		do {
			
			futureValue = (futureValue + monthlyPayment) * (1 + intRate);
			i++;
			System.out.println(futureValue);
			
		} while (i <= month);
		
		
	}

}
