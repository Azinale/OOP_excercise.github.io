import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = input(sc);
        int[] array2 = input(sc);
        printArray(array1);
        System.out.println(" ");
        printArray(array2);
        System.out.println(" ");
        System.out.println(swap(array1, array2));


    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter contents of Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;

            }
            return true;
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
