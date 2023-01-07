import java.util.Scanner;

public class CoppyOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = input(sc);
        int[] array2 = input(sc);
        if (array1.length == array2.length) {
            System.out.println("New array 2 is: ");
            printArray(copyOf(array1));
        } else {
            System.out.println("New array 2 is: ");
            printArray(copyOf(array1, array2.length));
        }

    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter contents of array: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;

    }

    public static int[] copyOf(int[] array1) {


        return array1;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        if (newLength > array.length) {
            for (int i = 0; i < newLength; i++) {
                if (i < array.length) {
                    newArray[i] = array[i];
                } else {
                    newArray[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < newLength; i++) {
                newArray[i] = array[i];

            }
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
