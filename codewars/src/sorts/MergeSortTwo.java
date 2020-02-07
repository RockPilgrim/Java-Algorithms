package sorts;

import java.util.Arrays;

public class MergeSortTwo {

    public static void main(String[] args) {
//        int[] array1 = {4, 3, 2, 1, 5, 8, 7, 6};
        int[] array1 = {4, 3, 2, 1, 5, 7, 6};
        System.out.print(Arrays.toString(array1) + " / " );
        mergeSort(array1, array1.length);
        System.out.println(Arrays.toString(array1));

    }

    public static void mergeSort(int[] array, int size) {
        if (size < 2) {
            return;
        }
        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left, left.length);
        mergeSort(right, right.length);

        merge(array, left, right, left.length, right.length);
    }

    private static void merge(int[] array, int[] left, int[] right, int lengthLeft, int lengthRight) {
        int i = 0, j = 0, k = 0;
        while (i < lengthLeft && j < lengthRight) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < lengthLeft) {
            array[k++] = left[i++];
        }
        while (j < lengthRight) {
            array[k++] = right[j++];
        }
    }
}
