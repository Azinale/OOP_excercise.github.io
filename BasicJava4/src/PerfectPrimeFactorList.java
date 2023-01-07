public class PerfectPrimeFactorList {

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Enter the upper bound : " + n);
        perfectPrimeFactorList(n);
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        if (aPosInt == 1) {
            return false;
        }
        for (int i = 1; i < aPosInt; i++) {
            if (isPrime(i) && aPosInt % i == 0) {
                product = product * i;
            }
        }
        if (product == aPosInt) {
            return true;
        }
        return false;
    }

    public static void perfectPrimeFactorList(int n) {
        System.out.println("These numbers are equal to the product of prime factors :");
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[%d numbers found ( %.2f%%)]", count, count * 100.0 / n);
    }
}
