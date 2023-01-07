public class TriangularPattern {
    public static void main(String[] args) {
        int size = 8;
        for (int row = 1; row <=size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col < row) {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
            System.out.println();
        for (int row = 1; row <=size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col > row) {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }



        for (int row = 1; row <=size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col >= row ) {
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row <=size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col + row >= size +1 ) {
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
