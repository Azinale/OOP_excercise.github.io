package com.sortstrategy;

public class SelectionSort implements ISort {
    public SelectionSort() {
    }

    public int sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[max]) {
                    max = j;
                }
            }

            int temp = array[max];
            array[max] = array[i];
            array[i] = temp;

            count++;
        }

        return count;
    }
}
