import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (isPrime(n) == true) {
            System.out.println(n+ " " + "is Prime Number");
        }else{
            System.out.println("not a prime number");
        }
    }

    public static boolean isPrime(int n) {
        if (n<2) {
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
