import java.util.Scanner;

public class Partition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        partition(n, n, "");
    }

    public static void partition(int max, int n, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
        }
        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(i, n - i, prefix + " " + i);
        }
    }

}
