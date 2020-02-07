package tasks;

public class NumberOfTrailingZerosOfN {

    public static void main(String[] args) {
        System.out.println("0 / " + zeros(0));
        System.out.println("1 / " + zeros(1));
        System.out.println("6 / " + zeros(6));
        System.out.println("12 / " + zeros(12));
        System.out.println("14 / " + zeros(14));
        System.out.println("15 / " + zeros(15));
        System.out.println("16 / " + zeros(16));
        System.out.println("20 / " + zeros(20));
    }

/*    public static int zeros(int n) {
        int z = 0;
        for (int k = 1; k < Math.log(n)/Math.log(5); k++) {
            z += n / Math.pow(5, k);
        }
        return z;
    }*/
    public static int zeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        return res;
    }

}
