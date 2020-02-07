package sorts;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {1, 23, 5, 89, 7, 521, 3, 6, 84, 2, 2, 2, 31, 8, 6, 8, 4, 5, 6, 32, 1, 56, 8};
        int[] array2 = {1, 2, 3, 5, 4, 3, 2, 1};
        int[] array3 = {1};

        System.out.print(Arrays.toString(array) + " / ");
        sort(array);

        System.out.print(Arrays.toString(array2) + " / ");
        sort(array2);

        System.out.print(Arrays.toString(array3) + " / ");
        sort(array3);
    }

    private static void sort(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap) {
//                    if (array[j] > array[j + gap]) {
                        swap(array, j, j + gap);
//                    }
                }
            }
            gap = gap / 2;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
