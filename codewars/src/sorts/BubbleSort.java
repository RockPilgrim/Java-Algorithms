package sorts;

import java.util.Arrays;

public class BubbleSort {
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

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
