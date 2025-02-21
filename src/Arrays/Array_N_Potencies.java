package Arrays;

import java.util.Scanner;

public class Array_N_Potencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("De quin numero vols fer les potènies?: ");
        int p = input.nextInt();
        System.out.print("Quantes potències vols?: ");
        int n = input.nextInt();

        ArrayPro.printArray(arraypotències(n, p));
    }

    public static int[] arraypotències(int n, int p){
        int[] potencies=new int[n];

        for(int i=0; i<potencies.length; i++) {
            potencies [i] = (int) Math.pow(p, i + 1);
        }
        return potencies;
    }
}