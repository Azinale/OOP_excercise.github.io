public class LinearSearch {

    public static void main(String[] args) {
        int key = 7;
        int[] array = {2, 1, 4, 7, 3, 7, 2, 6, 9};
        int[] array1 = {2, 6, 2, 34, 3, 2};
        System.out.println(linearSearch(array, key));
        System.out.println(linearSearchIndex(array, key));
        System.out.println(linearSearch(array1, key));
        System.out.println(linearSearchIndex(array1, key));

    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }
}
