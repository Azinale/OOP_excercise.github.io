public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 10000;
        System.out.println("Please enter the upper bound :" + n);
        PrimeList(n);
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

    public static void PrimeList(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.printf("[%d primes found ( %.2f%%)]", count, count * 100.0 / n);
    }
}
