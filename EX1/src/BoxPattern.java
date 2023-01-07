public class BoxPattern {
    public static void main(String[] args) {
        int size = 8;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("#");
                }
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == row) {
                    System.out.print("#");
                }
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row) {
                    System.out.print("#");
                }
                System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == row || col == size - row) {
                    System.out.print("#");
                }
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
