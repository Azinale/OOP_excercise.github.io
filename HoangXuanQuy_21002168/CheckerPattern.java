import java.util.Scanner;

public class CheckerPattern {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        int size;

        System.out.print("Enter the size: ");
        size = in.nextInt();

        in.close();

        for ( int row = 1; row <= size; row++ ) {
            for ( int col = 1; col <= size; col++ ) {
                if ( row%2 == 0 ) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    } 
}
