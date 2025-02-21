package Arrays;

import java.util.Scanner;

public class Array_copia1part {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Primer Num: ");
        int a = input.nextInt();

        System.out.print("Darrer Num: ");
        int b = input.nextInt();

        printArray(copiaArray(numsArray(a, b)));


    }

    public static int[] numsArray(int a, int b) {
        int[] array = new int[b - a + 1];   //Creació de l'array
        // Emplenar amb valors A i B
        for (int i = 0; i < array.length; i++) {
            array[i] = a + i;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d : %d.\n", i, array[i]);
        }
    }

    public static int[] copiaArray(int[] array) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }
        return copia;
    }

    public static int[] SubArray(int[] array, int a, int b) {
        int[] copia = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            copia[i - a] = array[i];
        }
        return copia;
    }
}
