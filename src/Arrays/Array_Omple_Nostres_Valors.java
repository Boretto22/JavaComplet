package Arrays;

import java.util.Scanner;

public class Array_Omple_Nostres_Valors {

    public static void main(String[] args) {

        // Declaració
        double[] nums;

        Scanner input = new Scanner(System.in);
        System.out.print("Num Caselles: ");
        int n = input.nextInt();

        // Inatancicaió & construcció
        nums = new double[n];

        // Emplenar amb valors aleatoris
        for (int i=0; i<nums.length; i++){
            nums[i] =10 +  Math.random()*10;
        }

        // Imprimir contingut array
        for (int i=0; i<nums.length; i++){
            System.out.printf("%f.\n", nums[i]);
        }
    }
}
