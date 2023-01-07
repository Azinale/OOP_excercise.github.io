import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        System.out.println(arrayToString(array));

    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter contents of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        return array;
    }

    public static String arrayToString(int[] array) {
        String newString = "";
        if (array.length == 1) {
            newString += "[ " + array[0] + " ]";

        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    newString += "[ " + array[i] + ", ";
                } else if (i > 0 && i < array.length - 1) {
                    newString += array[i] + ", ";
                } else {
                    newString += array[i] + " ]";
                }
            }
        }
        return newString;
    }
}
