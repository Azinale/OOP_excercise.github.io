import java.util.Scanner;

public class HanoiTower {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong dia cua thap");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }

    static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod) {
        if (n == 1) {
            System.out.println("Lay dia 1 tu cot " + from_rod + " sang cot " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, helper_rod, to_rod);
        System.out.println("Lay dia " + n + " tu cot " + from_rod + " sang cot " + to_rod);
        towerOfHanoi(n - 1, helper_rod, to_rod, from_rod);
    }

}