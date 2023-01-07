import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String sig = sc.nextLine().toUpperCase();
        char [] character = new char[sig.length()];
        int count = 0;
        for (int i = 0; i < sig.length(); i++) {
            char index = sig.charAt(i);
            if ((index >=65 && index<=90)) {
                count++;

            }
        }
        System.out.println("The number of word is: "+ count);
    }

}
