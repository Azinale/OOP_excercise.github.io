public class PerfectNumberList {

    public static void main(String[] args) {
        System.out.print("Enter the upper bound :");
        int n = 1000;
        perfectNumberList(n);

    }

    public static boolean isPerfect(int aPosInt) {
        if (aPosInt == 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum != aPosInt) {
            return false;
        }
        return true;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum > aPosInt) {
            return false;
        }
        return true;
    }

    public static void perfectNumberList(int n) {
        int countPerfect = 0;
        System.out.println("These numbers are perfect :");
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfect++;
            }
        }
        System.out.printf("\n[ %d perfect numbers found ( %.2f%%) ]", countPerfect, countPerfect * 100.0 / n);
        int countDeficient = 0;
        System.out.println("\nThese numbers are neither deficient nor perfect :");
        for (int i = 1; i <= n; i++) {
            if (!isDeficient(i)) {
                System.out.print(i + " ");
                countDeficient++;
            }
        }
        System.out.printf("\n[ %d perfect numbers found ( %.2f%%) ]", countDeficient, countDeficient * 100.0 / n);
    }
}
