import java.util.Scanner;
public class Oct2Dec {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print( "Enter an Octal string : " );
		str = sc.next();
		int num = Integer.parseInt(str);
		int sum = 0;
		int mu = 0;
		while ( num != 0 ) {
			int a = num % 10;
			sum = sum + a * (int) Math.pow(8, mu);
			num = num / 10;
			mu = mu + 1;
		}
		System.out.print( "The equivalent decimal number " + str + " is : " + sum );
	}
}
