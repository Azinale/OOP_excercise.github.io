import java.util.Scanner;

public class RemoveMiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = input(sc);
        if ((array.length / 2) + 1 % 2 == 0) {
            System.out.println("Day la ham co chan phan tu: @_@");
        } else {
            removeMiddle(array);
        }


    }

    public static int[] input(Scanner sc) {
        System.out.print("Hay nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        System.out.print("Hay nhap phan tu cua mang: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void removeMiddle(int[] array) {
        int[] removedArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < (array.length / 2) + 1) {
                removedArray[i] = array[i];
            } else {
                removedArray[i - 1] = array[i];
            }

        }
        for (int i = 0; i < removedArray.length; i++) {
            System.out.print(removedArray[i] + " ");

        }

    }


    public static void averageArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];

        }
        System.out.println("Gia tri trung binh cua mang la: "+ (double)sum/ array.length);


    }



}
