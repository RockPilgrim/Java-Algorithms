package tasks;

public class BabyMagpies {

    public static void main(String[] args) {
        String m1 = "BWBWBW";
        String m2 = "BWBWBB";
        String m3 = "WWWWBB";

        System.out.println("true / " + child(m1, m2));
        System.out.println("true / " + child(m2, m3));
        System.out.println("true / " + grandchild(m1, m3));
        System.out.println("false / " + child(m1, m3));
        System.out.println("false / false ; " + child("WWBBBBWBW", "BBWBBWWWB")+" / "+grandchild("WWBBBBWBW", "BBWBBWWWB"));
        System.out.println("false / true ; " + child("BWWBWBBW", "WBWWBBBW")+" / "+grandchild("BWWBWBBW", "WBWWBBBW"));
        System.out.println("true / false ; " + child("w", "B")+" / "+grandchild("W", "B"));
    }

    public static boolean child(final String bird1, final String bird2) {
        int total = 0;
        for (int i = 0; i < bird1.length(); i++) {
            if (bird1.charAt(i) != bird2.charAt(i)) {
                total++;
            }
        }
        return total >= 1 && total < 3;
    }

    public static boolean grandchild(final String bird1, final String bird2) {
        int total = 0;
        for (int i = 0; i < bird1.length(); i++) {
            if (bird1.charAt(i) != bird2.charAt(i)) {
                total++;
            }
        }
        if (bird1.length() == 1 && total == 1) {
            return false;
        }
        if (total >= 0 && total <= 4) {

            return true;
        }
        return false;
    }
}
