import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestingFiches {

    public static void main(String[] args) {
        String d = "Frsdv65";
        int[] arr = {1, 5, 6, 10, 2, 6, 8};
        int a = Arrays.stream(arr).reduce((left, right) -> left + right).getAsInt();
        System.out.println(a);
        System.out.println(Arrays.toString(d.chars().toArray()));
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.stream(arr).sorted());

//        sort(arr);
//        firstSomeElements(arr);
        peek(arr);
//        changeEveryElement(arr);
//        distinct(arr);
//        skip(arr);
//        filter1();
//        filter(arr);
//        bynarySearch(arr);
//        forEch(arr);
//        System.out.println(Integer.valueOf(d.replaceAll("\\D", "")));
    }

    private static void sort(int[] arr) {
        System.out.println(Arrays.toString(Arrays.stream(arr).sorted().toArray()));
    }

    private static void firstSomeElements(int[] arr) {
        System.out.println(Arrays.toString(Arrays.stream(arr).limit(4).toArray()));
    }

    private static void peek(int[] arr) {
        System.out.println(Arrays.toString(Arrays.stream(arr).peek(System.out::println).toArray()));
    }

    private static void changeEveryElement(int[] arr) {
        System.out.println(Arrays.toString(Arrays.stream(arr).map(operand -> operand+1).toArray()));
    }

    private static void distinct(int[] arr) {
        System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));
    }

    /// skip first n elements
    private static void skip(int[] arr) {
        System.out.println(Arrays.toString(Arrays.stream(arr).skip(3).toArray()));
    }

    private static void filter1() {
        List<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(("" + Arrays.toString(collection.stream().filter(integer -> integer % 2 == 0).toArray())));
    }

    private static void filter(int[] arr) {
        arr = Arrays.stream(arr).filter(value -> value % 2 == 0).toArray();
    }

    private static void bynarySearch(int[] arr) {
        int a;
        a = Arrays.binarySearch(arr, 6);
        System.out.println(a);
    }

    private static void forEch(int[] arr) {
        Arrays.stream(arr).forEach(i ->
                System.out.printf("%s ", i));
    }
}
