package BTVN4;

import java.util.Scanner;

public class FindMInMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        System.out.print("Min and Max is: "+ findMin(array)+" "+findMax(array));


    }

    public static int[] input(Scanner sc) {
        System.out.print("Enter the number of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter contents of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
}
