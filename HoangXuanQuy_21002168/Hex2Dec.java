
import java.util.Scanner;

public class Hex2Dec {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print( "Enter a Hexadecimal string : " );
		str = sc.next();
		sc.close();
		int num;
		int count = 0;
		for ( int i = 0; i < str.length(); i = i + 1 ) {
			if ( ('f' < str.charAt(i) && str.charAt(i) <= 'z') || ('F' < str.charAt(i) && str.charAt(i) <= 'Z') ) {
				count = count + 1;
			}
		}
		if ( count != 0 ) {
			System.out.print( "error: invalid hexadecimal string " + str );
		} else {
			num = Integer.parseInt(str, 16);
			System.out.print( "The equivalent decimal number for hexadecimal " + str + " is : " + num );
		}
	}
}
