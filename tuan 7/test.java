import java.util.Scanner;

public class test {
    
    public static int[] inputArray(Scanner sc){
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println(" \n mang co so phan tu la: "+size);
        return array;
    }

    public static int[] reverseArray (int[] arr, Scanner sc) {
      int chuoi = sc.nextInt();
      arr = new int[chuoi];
      StringBuffer str = new StringBuffer();
      System.out.println(str.reverse().toString());
      return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputArray(sc);
        int[] arr;
        reverseArray(arr, sc);
    }
}
