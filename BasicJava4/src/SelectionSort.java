public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        selectionSort(array);
        printArr(array);
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    public static void selectionSort(int[] array) {
        int check = 0;
        while (check < array.length) {
            int min = array[check];
            int idxMin = check;
            for (int i = check + 1; i < array.length; i++) {
                if (min > array[i]) {
                    idxMin = i;
                    min = array[i];
                }
            }
            if (idxMin != check) {
                swap(array, check, idxMin);
            }
            check++;
        }
    }

    public static void printArr(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
