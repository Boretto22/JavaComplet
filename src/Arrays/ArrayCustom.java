package Arrays;

import java.util.Scanner;

public class ArrayCustom {
    public static void main(String[] args) {

        // Declaració
        int[] nums;

        Scanner input = new Scanner(System.in);
        System.out.print("Num Caselles: ");
        int n = input.nextInt();

        System.out.print("Primer Num: ");
        int a = input.nextInt();

        System.out.print("Darrer Num: ");
        int b = input.nextInt();

        // Inatancicaió & construcció
        nums = new int[n];
        nums = new int[b-a+1];

        // Emplenar amb valors aleatoris
        for (int i=0; i<nums.length; i++){
            nums[i] = a+i;

        }

        // Imprimir contingut array
        for (int i=0; i<nums.length; i++){
            System.out.printf("%d.\n", nums[i]);
        }
    }
}
