package com.sortstrategy;

public class InsertionSort implements ISort {
    public InsertionSort() {
    }

    public int sort(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int max = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > max) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = max;

            count++;
        }

        return count;
    }
}