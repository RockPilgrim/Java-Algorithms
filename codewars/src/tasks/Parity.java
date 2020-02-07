package tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Parity {

    public static void main(String[] args) {
//        System.out.println((-2 % 2) + " / " + (-1 % 2));
        System.out.println("0\n" + "1 2 3\n");
        sort(3, new int[]{1, 2, 3});

        System.out.println("\n-1\n" + "- - -\n");
        sort(2, new int[]{1, 1});

        System.out.println("\n2\n" + "1 2 5 2 3 2\n");
        sort(6, new int[]{1, 3, 5, 2, 2, 2});

        System.out.println("\n4\n" + "1 0 1 0 1 0 1 0 1 0\n");
        sort(10, new int[]{1, 0, 0, 0, 1, 1, 0, 1, 1, 0});
    }

    private static void sort(int count, int[] arr) {
        ArrayList<Integer> parity1 = new ArrayList<>();
        ArrayList<Integer> parity2 = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        right.add(arr[0]);
        int total = 0;
        for (int i = 1; i < count; i++) {
            if (arr[i] % 2 != right.get(i-1) % 2) {
                right.add(arr[i]);
            } else {
                total++;
                if (arr[i] % 2 == 0) {
                    parity2.add(arr[i]);
                    right.add(-1);
                } else {
                    parity1.add(arr[i]);
                    right.add(-2);
                }
            }
        }
/*        for (int i = 1; i < count; i++) {
            if (right.get(i) > 0) {
                try {
                    if (right.get(i) % 2 == 0) {
                        right.remove(i);
                        right.add(i, parity2.get(0));
                        parity2.remove(0);
                    } else {
                        right.remove(i);
                        right.add(i, parity1.get(0));
                        parity1.remove(0);
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("-1");
                    return;
                }
            }
        }*/
        System.out.println(total);
        Arrays.stream(right.toArray()).peek(o -> System.out.print(o + " ")).toArray();
        System.out.print("\n");
    }

}
