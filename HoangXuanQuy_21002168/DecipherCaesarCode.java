import java.util.Scanner;

public class DecipherCaesarCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("Enter a ciphertext string : ");
		str = sc.next();
		sc.close();
		str = str.toUpperCase();
		System.out.print("The plaintext string is : ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				System.out.print("X");
			} else {
				if (str.charAt(i) == 'B') {
					System.out.print("Y");
				} else {
					if (str.charAt(i) == 'C') {
						System.out.print("Z");
					} else
						System.out.print((char) (str.charAt(i) - 3));
				}
			}
		}
	}
}
