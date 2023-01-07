import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you guess: ");
        int number = 0;
        try {
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Please enter a number: ");
            number = sc.nextInt();
        }
        guessNumber(SECRET_NUMBER, number, sc);
    }

    public static void guessNumber(int SECRET_NUMBER, int number, Scanner sc) {
        int count = 1;
        while (number != SECRET_NUMBER) {
            if (number > SECRET_NUMBER) {
                System.out.println("Try lower!");
                int reEnter = sc.nextInt();
                number = reEnter;
            } else if (number < SECRET_NUMBER) {
                System.out.println("Try higher!");
                int reEnter = sc.nextInt();
                number = reEnter;
            }
            count++;
            if (number == SECRET_NUMBER) {
                System.out.println("You got it in " + count + " Trials");
                break;
            }
        }
    }
}
