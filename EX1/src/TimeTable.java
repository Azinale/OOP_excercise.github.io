public class TimeTable {
    public static void main(String[] args) {
        int size = 10;
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <=10; col++) {
                System.out.print( row*col + " ");
            }
            System.out.println();
        }
    }
}
