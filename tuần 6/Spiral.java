import java.util.Scanner;

class Spiral {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]= (int)(Math.random()*100);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        spiralMatrixPrint(a);
    }
    public static void spiralMatrixPrint(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        int dir = 1;

        while (top <= bottom && left <= right) {

            if (dir == 1) {
                for (int i = left; i <= right; ++i) {
                    System.out.print(arr[top][i] + " ");
                }
                ++top;
                dir = 2;
            }
            else if (dir == 2) {
                for (int i = top; i <= bottom; ++i) {
                    System.out.print(arr[i][right]+ " ");
                }
                --right;
                dir = 3;
            }
            else if (dir == 3) {
                for (int i = right; i >= left; --i) {
                    System.out.print(arr[bottom][i]+ " ");
                }
                --bottom;
                dir = 4;
            }
            else if (dir == 4) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(arr[i][left]+ " ");
                }
                ++left;
                dir = 1;
            }
        }
    }
}