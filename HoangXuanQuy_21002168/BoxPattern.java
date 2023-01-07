import java.util.Scanner;

public class BoxPattern {
    public static void getBoxPatternA( int size ) {
        for ( int row = 1; row <= size; row++ ) {
            if ( row == 1 || row == size ) {
                for ( int col = 1; col <= size; col++ ) {
                    System.out.print("# ");
                }
            } else {
                System.out.print("# ");
                for ( int col = 1; col <= size-2; col++ ) {
                    System.out.print("  ");
                }
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    public static void getBoxPatternB( int size ) {
        for ( int row = 1; row <= size; row++ ) {
            if ( row == 1 || row == size ) {
                for ( int col = 1; col <= size; col++ ) {
                    System.out.print("# ");
                }
            } else {
                System.out.print("  ");
                for ( int col = 2; col < size; col++ ) {
                    if ( row == col) {
                        System.out.print("# ");
                    }
                    System.out.print("  ");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void getBoxPatternC( int size ) {
        for ( int row = 1; row <= size; row++ ) {
            if ( row == 1 || row == size ) {
                for ( int col = 1; col <= size; col++ ) {
                    System.out.print("# ");
                }
            } else {
                System.out.print("  ");
                for ( int col = size-1; col > 1; col-- ) {
                    if ( row == col) {
                        System.out.print("# ");
                    }
                    System.out.print("  ");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void getBoxPatternD( int size ) {
        for ( int row = 1; row <= size; row++ ) {
            System.out.print("# ");
        }    

        System.out.println();
        for ( int row = 2; row < size; row++ ) {
            for ( int col = 1; col < size; col++ ) {
                if ( row == col || row + col == size +1 ) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for ( int row = 1; row <= size; row++ ) {
            System.out.print("# ");
        }
    }

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        int size;

        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();

        // Compute program BoxPatternA
        getBoxPatternA(size);

        // Compute program BoxPatternB
        System.out.println();
        getBoxPatternB(size);

        // Compute program BoxPatternB
        System.out.println();
        getBoxPatternC(size);

        // Compute program BoxPatternB
        System.out.println();
        getBoxPatternD(size);
    }
}
