package tasks;

public class Solution {

    public static void main(String[] args) {

        System.out.println("theStealthWarrior / " + toCamelCase("the_Stealth_Warrior"));
        System.out.println("theStealthWarrior / " + toCamelCase("the-Stealth-Warrior"));

    }

    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
