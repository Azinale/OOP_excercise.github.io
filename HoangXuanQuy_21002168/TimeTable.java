public class TimeTable{
    public static void main(String[] args) {
        int size = 10;
        System.out.println("Enter the size : " + size);
        System.out.print(" *  |  ");
        for ( int i = 1; i <= size; i++ ) {
            System.out.printf("%4d  ", i);
        }
            System.out.println(" ");
       for ( int i = 0; i <= size + 11; i++ ) {
            System.out.printf(" --"); 
        }
        for ( int row = 1; row <= size; row++ ) {
            if ( row < size  ) {
                System.out.printf("\n" + " " + row + "  |  ");
            } else {
                System.out.printf("\n" + row + "  |  ");
            }
            int multiply;
            for ( int col = 1; col <= size; col++) {	
                multiply = row * col;
                System.out.printf("%4d  ", multiply);
            }
        }
    }
}
    