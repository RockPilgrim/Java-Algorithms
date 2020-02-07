package tasks;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println("0 / " + duplicateCount("abcde"));
        System.out.println("1 / " + duplicateCount("abcdea"));
        System.out.println("1 / " + duplicateCount("indivisibility"));
        System.out.println("2 / " + duplicateCount("Indivisibilities"));
        System.out.println("2 / " + duplicateCount("aA11"));
        System.out.println("2 / " + duplicateCount("ABBA"));

        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;
        System.out.println("3 / " + duplicateCount(test));
    }

    public static int duplicateCount(String text) {
        Set<String> count = new HashSet<>();

        for (String string : text.toLowerCase().split("")) {
            if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string))
                count.add(string);
        }

        return count.size();
    }

    /*public static int duplicateCount(String text) {
        char[] chars=text.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                if (Character.toLowerCase(chars[i]) == Character.toLowerCase(chars[j])) {
                    characters.add(Character.toLowerCase(chars[i]));
                    break;
                }
            }
        }
        return (int)Arrays.stream(characters.toArray()).distinct().count();
    }*/
//                characters.add(chars[Arrays.binarySearch(chars, i + 1, chars.length, Character.toLowerCase(chars[i]))]);

}
