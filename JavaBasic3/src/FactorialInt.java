public class FactorialInt {
    public static void main(String[] args) {
        FactorialInt aFactorialInt = new FactorialInt();
        System.out.println("Int factorials:");
        aFactorialInt.printIntFactorials();
    }

    private void printIntFactorials() {
        int i = 1;
        int factorial = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, factorial);
            if (Integer.MAX_VALUE / factorial < (i + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i + 1));
                break;
            }
            i++;
            factorial *= i;
        }
    }
}
