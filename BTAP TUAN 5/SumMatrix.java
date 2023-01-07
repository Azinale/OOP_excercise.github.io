import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = input(sc);
        int[][] arr2 = input(sc);
        printArray(sumArray(arr1,arr2));

    }

    public static int[][] sumArray(int[][] arr1, int[][] arr2) {
        int col = arr1[0].length;
        int row = arr1.length;
        int[][] newArray = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newArray[i][j] = arr1[i][j] + arr2[i][j];
            }

        }
        return newArray;

    }

    public static int[][] input(Scanner sc) {
        System.out.print("Nhap so hang");
        int row = sc.nextInt();
        System.out.print("Nhap so cot");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        return arr;
    }

    public static void printArray(int[][] array) {
        int row = array.length;
        int col = array[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
