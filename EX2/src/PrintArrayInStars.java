import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        printArrayInStars(array);

    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of all items(separated by space): ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < array[i]; j++) {

                System.out.print("*");

            }
            System.out.print("(" + array[i] + ")");
            System.out.println(" ");

        }

    }
}
