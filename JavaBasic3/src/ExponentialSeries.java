import java.util.Scanner;

public class ExponentialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        double x = 0.5;
        int numTerms = 3;
        System.out.println(specialSeries(x, numTerms));
    }

    public static double specialSeries(double x, int numTerm) {
        double sum = 0;
        for (int i = 1; i <= numTerm * 2; i += 2) {
            double base = 1;
            double numerator = 1;
            double denominator = 1;
            for (int j = 1; j <= i; j++) {
                base  = x;
                if (j < i && j % 2 == 0) {
                    denominator = j;
                } else if (j < i) {
                    numerator = j;
                }
            }
            sum += (base / i) * (numerator / denominator);
        }
        return sum;
    }
}
