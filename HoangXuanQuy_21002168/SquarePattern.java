import java.util.Scanner;
public class SquarePattern {
    public static void getWhileDoLoop( int size ) {
        int count = 1;
        while ( count <= size ) {
            for ( int row = 0; row < size; row++ ) {
                System.out.print("# ");               
            }
            System.out.println();
            count++;
        }
    }
    
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();
        
        System.out.println("Prints the square pattern using two for-loops: ");
        for ( int row = 1; row <= size; row++ ) {
            for ( int col = 1; col <= size; col++ ) {
                System.out.print("# ");
            }
            System.out.println();
        }
        
        // Compute using nested while-do loops.
        System.out.println("Prints the square pattern using while-do: ");
        getWhileDoLoop(size);
    }
}
