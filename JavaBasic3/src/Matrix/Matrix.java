package Matrix;

public class Matrix {

    public static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }

        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        } else {
            return false;
        }


    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] newMatrix = new int[matrix1.length][matrix2[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return newMatrix;
        } else {
            return null;
        }
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] newMatrix = new double[matrix1.length][matrix2[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return newMatrix;
        } else {
            return null;
        }
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] newMatrix = new int[matrix1.length][matrix2[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    newMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return newMatrix;
        } else {
            return null;
        }
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] newMatrix = new double[matrix1.length][matrix2[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    newMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return newMatrix;
        } else {
            return null;
        }
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int sum = 0;
        int[][] newMatrix = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    newMatrix[i][j] = sum;
                    sum = 0;
                }
            }
            return newMatrix;
        }
        return null;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double sum = 0;
        double[][] newMatrix = new double[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    newMatrix[i][j] = sum;
                    sum = 0.0;
                }
            }
            return newMatrix;
        }
        return null;
    }
}
