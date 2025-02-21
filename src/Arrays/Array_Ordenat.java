package Arrays;

public class Array_Ordenat {
    public static void main(String[] args) {
        int[] a= {1,5,2,6,9,};
        ordenarArray(a);
        ArrayPro.printArray(a);
    }

    public static void ordenarArray(int[] a){
        boolean ordenat = false;
        while(!ordenat) {
            ordenat = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    ordenat=false;
                }
            }
        }
    }
}
