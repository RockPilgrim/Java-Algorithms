package sorts;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {1, 23, 5, 89, 7, 521, 3, 6, 84, 2, 2, 2, 31, 8, 6, 8, 4, 5, 6, 32, 1, 56, 8};
        int[] array2 = {1, 2, 3, 5, 4, 3, 2, 1};

        System.out.print(Arrays.toString(array) + " / ");
        sort(array);

        System.out.print(Arrays.toString(array2) + " / ");
        sort(array2);
    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int n = i;
            for (int j = i; j < array.length; j++) {
                if (array[n] > array[j]) {
                    n = j;
                }
            }
            swap(array, n, i);
        }
        System.out.println(Arrays.toString(array));
    }


}
