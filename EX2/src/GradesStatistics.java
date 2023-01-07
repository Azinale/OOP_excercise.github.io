import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        findAverage(array);
        findMin(array);
        findMax(array);

    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void findAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The average is: " + (double) sum / array.length);
    }

    public static void findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.print("The maximum is: " + max);
    }

    public static void findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("The minimum is: " + min);
    }
}
