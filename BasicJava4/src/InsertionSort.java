public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5, 2, 7};
        insertionSort(array);
        printArr(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

    }

    public static void printArr(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
