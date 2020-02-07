package tasks;

public class LargeFactorials {

    public static void main(String[] args) {
//        System.out.println("1 / "+Factorial(1));
//        System.out.println("120 / "+Factorial(5));
//        System.out.println("362880 / "+Factorial(9));
//        System.out.println("1307674368000 / "+Factorial(15));
        System.out.println("15511210043330985984000000 / "+Factorial(25));

    }

    public static String Factorial(int n) {
        long value = 1;
        StringBuilder zeros = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            value *=(long) i;
            if ((value % 10) == 0) {
                zeros.append("0");
                value /= 10;
            }
        }
        return value+zeros.toString();
//        return zeros.replace(0, String.valueOf(value).length(), String.valueOf(value)).toString();
    }

}
