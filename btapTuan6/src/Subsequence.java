import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("nhap input string: ");
        String input = reader.nextLine();
        System.out.println("nhap so k: ");
        int k = reader.nextInt();
        reader.close();
        subSq(input, k);
    }

    public static String[] subSq(String input, int k) {
        String[] output = new String[input.length() - k];//create a String array to save the subSequence
        for (int i = 0; i < input.length() - k; i++) {
            output[i] = (String) input.subSequence(i, i + k);
            System.out.println(output[i]);
        }
        return output;
    }
}
