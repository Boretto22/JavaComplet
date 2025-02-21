package ActivBasic;

public class Mitjana_Arrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {2, 4, 6, 8};
        int[] c = {1, 3, 5, 9, 11, 13};


        System.out.printf("La suma de l'array A és %f.", calculaMitjana(a));
        System.out.printf("La suma de l'array B és %f.", calculaMitjana(b));
        System.out.printf("La suma de l'array C és %f.", calculaMitjana(c));
    }

    public static int calculaSuma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma;
    }


    public static float calculaMitjana(int[] array) {

        return calculaSuma(array) / array.length;
    }
}