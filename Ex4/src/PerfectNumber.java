import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        findPerfectNumber(array);
    }

    public static int[] findPerfectNumber(int[] array){
        int[] newArray = new int[array.length];
        int sum=0;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1]%i==0){
                sum+=i;
            }
            if (array[i] == sum){
                newArray[i]=array[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        return newArray;
    }
}
