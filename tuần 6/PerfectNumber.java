package BTVN4;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number or -1 to end: ");
        int number = sc.nextInt();
        String perfectNumber = " ";
        while (number != -1) {
            if (checkPerfectNumber(number)) {
                perfectNumber += number + " ";
            }
            System.out.print("Enter a positive number or -1 to end: ");
            number = sc.nextInt();
        }
        System.out.println("The perfect number is: " + perfectNumber);
    }

    public static boolean checkPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;

    }
}
