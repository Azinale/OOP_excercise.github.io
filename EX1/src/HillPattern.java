public class HillPattern {
    public static void main(String[] args) {
        int numrow = 5;
        for (int row = 1; row <= numrow; row++) {
            for (int col = 0; col <= numrow; col++) {
                if (col + row < numrow +1) {
                    System.out.print("# ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

            System.out.println();


        for (int i = 1; i<=numrow ; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j< numrow; j++) {
                System.out.print(" #");
            }
            for (int j = i; j<=numrow; j++) {
                System.out.print(" #");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i<=numrow ; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j< numrow; j++) {
                System.out.print(" #");
            }
            for (int j = i; j<=numrow; j++) {
                System.out.print(" #");
            }

            System.out.println();
        }
    }
}

