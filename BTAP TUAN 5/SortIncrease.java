import java.util.Scanner;

public class SortIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        array = sortArray(array);
        printArray(array);
        printMax(array);
        printMedian(array);
        printVariance(array);

    }

    public static int[] input(Scanner sc) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }
        return array;
    }

    public static int[] sortArray(int[] arr) {

        while (true) {
            boolean sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    sorted = false;
                    int temporary = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temporary;
                }
            }
            if (sorted == true) {
                break;
            }


        }
        return arr;


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
    }

    public static void printMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                max = array[i + 1];
            }

        }
        System.out.println("Gia tri lon nhat cua mang la: " + max);

    }

    public static void printMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                min = array[i + 1];
            }

        }
        System.out.println("Gia tri nho nhat cua mang la : " + min);
    }

    public static void printMedian(int[] array) {
        if (array.length % 2 != 0) {
            System.out.println("Gia tri trung vi la: " + array[array.length / 2]);
        } else {
            double med1 = array[array.length / 2];
            double med2 = array[(array.length / 2) - 1];
            double median = (med1 + med2) / 2.0;
            System.out.println("Gia tri trung vi la: " + median);
        }
    }

    public static void printVariance(int[] array) {
        int sum = 0;
        double sumVariance = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        double average = (double) sum / array.length;
        System.out.println("Gia tri trung binh cua mang la: " + average);
        for (int i = 0; i < array.length; i++) {
            sumVariance += ((double) array[i] - average) * ((double) array[i] - average);

        }
        System.out.printf("%s %.2f","Phuong sai cua day la: ", sumVariance / (double) array.length);


    }


}
