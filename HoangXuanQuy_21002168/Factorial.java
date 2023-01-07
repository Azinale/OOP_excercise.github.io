/**
 * Print factorial of n
 */
public class Factorial {

	public static void main(String[] args) { // Set an initial
		// TODO Auto-generated method stub
		int n = 20;
		long factorial = 1;

		for (int i = 1; i <= n; i++ ) {  // i= 1, 2, 3, ...., n
          factorial = factorial *i ;			
		}
		System.out.println("The Factorial of " + n +" is " + factorial);
	}

}
