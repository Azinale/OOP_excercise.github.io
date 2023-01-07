import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String inStr; // input String
		int inStrLen; // length of the in put String

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		inStr = in.nextLine(); // use next() to read a String
		inStrLen = inStr.length();
		String text = "";
		char[] reverse = inStr.toCharArray();
		// Use inStr.charAt(index) in a loop to extract each character
		// The String 's index begins at 0 from the left
		// Process the String from the right
		for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
			// charIdx = inStrLen - 1, inStrLen - 2, ... , 0
			text = text + reverse[charIdx];
		}
		System.out.println("The reverse of the String " +"is: " + text );
	}
}
