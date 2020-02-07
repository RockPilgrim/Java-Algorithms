package tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Order {

    public static void main(String[] args) {
        System.out.println("Thi1s is2 3a T4est / " + order("is2 Thi1s T4est 3a"));
        System.out.println("Fo1r the2 g3ood 4of th5e pe6ople / " + order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(" / " + order(""));
    }

    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((s, s2) -> s + " " + s2).get();
    }
/*    public static String order(String words) {
        StringTokenizer tokenizer = new StringTokenizer(words);
        String[] sequence = new String[tokenizer.countTokens()];
        int count = tokenizer.countTokens();
        for (int i = 0; i < count; i++) {
            String token = tokenizer.nextToken();
            for (int j = 0; j < token.length(); j++) {
                if (Character.isDigit(token.charAt(j))) {
                    sequence[-1+Integer.parseInt(String.valueOf(token.charAt(j)))] = token;
                    break;
                }
            }
        }
        return Arrays.toString(sequence).substring(1, Arrays.toString(sequence).length() - 1).replace(",","");
    }*/

}
