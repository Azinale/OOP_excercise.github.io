public class CheckerPattern {
    public static void main(String[] args) {
        int size = 7;
        for (int row = 1; row <=size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row %2) == 0 && (col == 1)) {
                    System.out.print(" ");
                }
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
