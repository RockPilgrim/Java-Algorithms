package tasks;

import java.util.Arrays;

public class MissingLetter {

    public static void main(String[] args) {

        char c = 'c';
        c++;
        System.out.println(c);
        System.out.println('a' + " " + 'b' + " " + 'c');

        System.out.println("e" + String.valueOf(findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'})));
        System.out.println("P" + String.valueOf(findMissingLetter(new char[]{'O', 'Q', 'R', 'S'})));
    }

    public static char findMissingLetter(char[] array) {
        int i = 0;
        for (char c = array[0]; c < array[array.length-1]; c++) {
            if (array[i] != c)
                return c;
            i++;
        }
        return ' ';
    }
}
