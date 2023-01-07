package BTVN4;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);

        printArray(sortArray(array));
    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter contents of array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] sortArray(int[] array) {
        while (true) {
            boolean sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
                if (sorted == true){
                    break;
                }

        }
        return array;
    }
}
