import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        printArray(array);
    }

    public static void printArray(int[] array) {
        if (array.length == 1) {
            System.out.print("[ " + array[0] + " ]");
        } else {

            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[ " + array[i] + ", ");
                } else if (i > 0 && i < array.length - 1) {
                    System.out.print(array[i] + ", ");

                } else {
                    System.out.print(array[i] + " ]");
                }
            }
        }
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
}