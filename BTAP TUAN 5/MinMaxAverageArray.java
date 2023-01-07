package OneDimesionArray;

import java.util.Scanner;


public class MinMaxAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        System.out.println("Min cua mang la: " + findMin(array));
        System.out.println("Max cua mang la: " + findMax(array));
        System.out.println("Trung binh cua mang la: " + average(array));

    }

    public static int[] input(Scanner sc) {
        System.out.print("Hay nhap so phan tu cua mang: ");
        int arraySize = sc.nextInt();
        System.out.print("Nhap phan tu mang: ");
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();

        }
        return array;

    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static double average(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return (double) sum / arr.length;

    }


}