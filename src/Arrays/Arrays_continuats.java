package Arrays;

public class Arrays_continuats {

    public static void main(String[] args) {

        int[] a = {3, 3, 8, 4};
        int[] b = {5, 7, 3, 6};

        ArrayPro.printArray(ajuntarArray(a, b));
    }

    public static int[] ajuntarArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return c;
    }
}
