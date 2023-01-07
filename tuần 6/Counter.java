package BTVN4;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        int[] count = removeDuplicate(array);
        printCountNumber(count, array);
    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter contens of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printCountNumber(int[] count, int[] array) {
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println("So " + array[i] + " xuat hien: " + count[i] + " lan");
            }
        }
    }

    public static int[] removeDuplicate(int[] array) {
        int[] counts = new int[array.length];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] == array[j]) {
                    counts[j] = 0;
                    count++;
                }
            }
            if (counts[i] != 0) {
                counts[i] = count;
            }
        }
        return counts;

    }

}
