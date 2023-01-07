import java.util.Scanner;

public class TransformMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        input(matrix);
        printMatrix(matrix);
        transformMatrix(matrix);
        System.out.println("Ma tran chuyen vi la");
        printMatrix(matrix);


    }

    public static void input(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("ma tran random");
    }

    public static void transformMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
        }
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");


            }
            System.out.println(" ");
        }

    }

}
