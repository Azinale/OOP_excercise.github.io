public class MultiplicationTable {
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        int n = 12;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}