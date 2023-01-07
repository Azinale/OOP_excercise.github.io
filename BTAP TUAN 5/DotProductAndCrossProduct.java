import java.util.Scanner;

public class DotProductAndCrossProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array1 = input(sc);
        double[] array2 = input(sc);
        dotProduct(array1, array2);
        crossProduct(array1, array2);
    }

    public static double[] input(Scanner sc) {
        double[] array = new double[3];
        System.out.println("Nhap cac phan tu cua mang (3 phan tu) : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void dotProduct(double[] array1, double[] array2) {
        double dotProduct = 0;
        for (int i = 0; i < array1.length; i++) {
            dotProduct += array1[i] * array2[i];
        }
        System.out.println("Tich vo huong cua 2 vec to la: " + dotProduct);
    }

    public static void crossProduct(double[] array1, double[] array2) {
        double[] newArray = new double[3];
        newArray[0] = array1[1] * array2[2] - array1[2] * array2[1];
        newArray[1] = array1[2] * array2[0] - array1[0] * array2[2];
        newArray[2] = array1[0] * array2[1] - array1[1] * array2[0];
        System.out.println("Tich co huong cua 2 vec to la: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

}
