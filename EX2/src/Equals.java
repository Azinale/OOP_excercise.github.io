import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = input(sc);
        int[] array2 = input(sc);
        System.out.println(equals(array1, array2));

    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter the contents of array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static boolean equals(int[] array1, int[] array2) {
        int count = 0;
        if (array1.length != array2.length) {
            return false;
        } else {

            for (int i = 0; i < array2.length; i++) {
                if (array1[count] == array2[i]) {
                    count++;
                }
            }
            if (count == array2.length) {
                return true;
            }
        }
        return false;

    }
}
