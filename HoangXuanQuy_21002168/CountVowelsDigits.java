import java.util.Scanner;
public class CountVowelsDigits {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		String text;
		System.out.print("Enter a String : ");
		text = input.nextLine().toLowerCase();
		double VowelsCount = 0 ;
		double DigitsCount = 0;
	    for(int i = 0; i < text.length(); i++) { 
	    char ch = text.charAt(i); 
	      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
	    	 VowelsCount++; 
	      }
	      else if ( ch <= '9' && ch>= '0' ) {
	    	  DigitsCount++; 
	      }
		}
		  System.out.printf("Number of vowels : " + ( int )VowelsCount );
		  System.out.printf(" (%.2f%%", VowelsCount / text.length()*100 );
		  System.out.printf(")");
		  System.out.printf("\nNumber of digits : " + ( int ) DigitsCount);
		  System.out.printf(" (%.2f%%", DigitsCount  / text.length()*100 );
		  System.out.printf(")");
	}
}
