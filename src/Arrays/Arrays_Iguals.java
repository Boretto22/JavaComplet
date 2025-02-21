package Arrays;

import java.util.Scanner;

public class Arrays_Iguals {

    public static void main(String[] args) {

        int[]a1={5,4,7,6,5,4,7,2,4};
        int[]a2={5,4,7,5,6,8,5,6,8};

        System.out.printf("Iguals = %b", arraysIguals(a1,a2));
    }

    public static boolean arraysIguals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            boolean iguals = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return iguals;
        }
    }
}
