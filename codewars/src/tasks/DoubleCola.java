package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class DoubleCola {

    public static void main(String[] args) {
        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        String[] names2 = new String[]{"Penny"};
//        System.out.println("Penny / " + WhoIsNext(names2, 1));
//        System.out.println("Sheldon / " + WhoIsNext(names, 1));
        System.out.println("Sheldon / " + WhoIsNext(names, 6));
        System.out.println("Penny / " + WhoIsNext(names, 11));
        System.out.println("Leonard / " + WhoIsNext(names, 20));
        System.out.println("Penny / " + WhoIsNext(names, 52));
    }

    public static String WhoIsNext(String[] names, int n){
        while ( n > names.length){
            n = (n - (names.length - 1)) / 2;
            System.out.println(n);
        }
        return names[n-1];
    }

/*    public static String WhoIsNext(String[] names, int n) {
        int left = 0;
        int right = 0;
        for (int j = 0, i = 0; i < n; i += names.length*Math.pow(2,j), j++) {
            left = i;
            right = i + (int)(names.length * Math.pow(2, j));
        }
        double twins = (right - left) / names.length;
        int namePos = (int) Math.ceil((double) (n - left) / twins - 1);
        return names[namePos];
    }*/
/*    public static String WhoIsNext(String[] names, int n) {
        ArrayList<String> gyes = new ArrayList<>();
        gyes.addAll(Arrays.asList(names));
        for (int i = 0; i < n - names.length; i++) {
            gyes.add(gyes.get(i));
            gyes.add(gyes.get(i));
        }
        return gyes.get(n-1);
    }*/
}
