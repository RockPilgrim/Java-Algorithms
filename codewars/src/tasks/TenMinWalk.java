package tasks;

public class TenMinWalk {

    public static void main(String[] args) {
        TenMinWalk b = new TenMinWalk();
        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}) + " / true");
        System.out.println(isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}) + " / false");
        System.out.println(isValid(new char[]{'w'}) + " / false");
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}) + " / false");
    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int horizontal = 0;
        int vertical = 0;
        for (int i = 0; i < 10; i++) {
            switch (walk[i]) {
                case 'n':
                    vertical++;
                    break;
                case 's':
                    vertical--;
                    break;
                case 'w':
                    horizontal++;
                    break;
                case 'e':
                    horizontal--;
                    break;
            }
        }
        return vertical == 0 && horizontal == 0;
    }
}
