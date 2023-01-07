public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        bubbleSort(array);
        printArr(array);
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void printArr(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
