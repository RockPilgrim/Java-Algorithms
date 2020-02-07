package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDifferent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println(Arrays.stream(scanner.nextLine().split(" "))
                .distinct()
                .mapToLong(Long::valueOf)
                .sum());
    }
}