package Arrays;

public class ArraysMitjana {
    public static void main(String[] args){

        int[] a = {5, 9, 2, 0, 7};
        int[] b = {9, 2, 6, 0, 0};

        float m1 = mitjanaArray(a);
        System.out.printf("La mitjana de l'array A és %f.\n", m1);

        float m2= mitjanaArray(b);
        System.out.printf("La mitjana de l'array B és %f.\n", m2);

    }

    public static float mitjanaArray(int[] a){
        return (float) sumaArray(a) / a.length;
    }


    public static int sumaArray(int[] a){
        int s = 0;
        for(int i=0; i<a.length; i++){
            s = s + a[i];
        }
        return s;
    }
}
