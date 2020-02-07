package tasks;

import java.text.DecimalFormat;
import java.util.stream.IntStream;

public class NthSeries {

    public static void main(String[] args) {
//        System.out.println(IntStream.range(2, 10).count());
        System.out.println("1.57 / "+ seriesSum(5));
        System.out.println("1.77 / "+ seriesSum(9));
        System.out.println("1.94  / "+ seriesSum(15));
    }

    public static String seriesSum(int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (1.0 / (double) (1 + (i * 3)));
        }
        System.out.println(IntStream.range(0, n).mapToDouble(num -> 1.0 / (1 + num * 3)).sum());
        return String.format("%.2f",sum);
    }

}
