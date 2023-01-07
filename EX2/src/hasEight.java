import java.util.Scanner;

public class hasEight {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(sumMagic(keyboard));
        keyboard.close();
    }

    public static boolean hasEight(int number) {
        while (number > 1) {
            if (number % 10 == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    public static int sumMagic(Scanner keyboard) {
        int number;
        int sum = 0;
        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = keyboard.nextInt();
            if (hasEight(number)) {
                sum += number;
            }
        } while (number == -1);
        return sum;
    }
}
