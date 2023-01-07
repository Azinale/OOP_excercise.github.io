public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int key = array[6];
        System.out.println(binarySearch(array, key, 0, array.length - 1));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (array[fromIdx] == key) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleidx = (fromIdx + toIdx) / 2;
            if (array[middleidx] == key) {
                return true;
            } else if (array[middleidx] < key) {
                fromIdx = middleidx + 1;
            } else {
                toIdx = middleidx;
            }
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }
}
