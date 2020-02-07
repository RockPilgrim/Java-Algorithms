package sorts;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {1, 23, 5, 89, 7, 521, 3, 6, 84, 2, 2, 2, 31, 8, 6, 8, 4, 5, 6, 32, 1, 56, 8};
//        int[] array2 = {1, 2, 3, 5, 4, 3, 2, 1};
//        int[] array2 = {4, 3, 2, 1, 4, 3, 2, 1};
        int[] array2 = {1, 2, 3, 5, 4, 7, 6};
        int[] array3 = {1};

/*        System.out.print(Arrays.toString(array) + " / ");
        sort(array);*/

        System.out.print(Arrays.toString(array2) + " / ");
        sort(array2);

/*        System.out.print(Arrays.toString(array3) + " / ");
        sort(array3);*/

//        System.out.println(recursion(5));
    }
    public static int recursion(int n) {
        // условие выхода
        // Базовый случай
        // когда остановиться повторять рекурсию ?
        if (n == 1) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) * n;
    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

/*    public static void mergeSort(int[] array, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;

        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(array, left, delimiter - 1);
            mergeSort(array, delimiter, right);
        }

        int[] buffer = new int[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || array[cursor] < array[delimiter]) {
                buffer[i] = array[cursor];
                cursor++;
            } else {
                buffer[i] = array[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, array, left, buffer.length);
    }*/

    private static void sort(int[] array) {
        System.out.println();
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if ((right - left + 1) < 2) {
            return;
        }
        int delimiter = (right - left) / 2 + left;
        mergeSort(array, left, delimiter);
        mergeSort(array, delimiter + 1, right);

        int cursor = left;
        int[] buffer = new int[right - left + 1];
        int c = 0;
//        System.out.println(Arrays.toString(Arrays.copyOfRange(array, left, right + 1)));
        for (int i = left; i < right + 1; i++) {
            if ((delimiter + 1) > right || array[cursor] < array[delimiter + 1]) {
//                array[cursor]++;
                buffer[(i - left)] = array[cursor];
                cursor++;
            } else {
                buffer[(i - left)] = array[delimiter + 1];
//                array[delimiter + 1]--;
                delimiter++;
            }
            c++;
        }
        System.out.println(buffer.length + " / " + c);
        for (int i = 0, j = left; i < right ; i++, j++) {
            System.out.println(array[j]);
//            System.out.println(buffer[i]);
        }
//        System.arraycopy(buffer, 0, array, left, buffer.length);
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, left, right + 1)) + " / " + Arrays.toString(buffer));
    }

}
