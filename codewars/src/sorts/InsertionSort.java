package sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {1, 23, 5, 89, 7, 521, 3, 6, 84, 2, 2, 2, 31, 8, 6, 8, 4, 5, 6, 32, 1, 56, 8};
        int[] array2 = {1, 2, 3, 5, 4, 3, 2, 1};

        System.out.print(Arrays.toString(array) + " / ");
        sort(array);

        System.out.print(Arrays.toString(array2) + " / ");
        sort(array2);
    }

    private static void sort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
