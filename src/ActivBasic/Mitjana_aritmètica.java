package ActivBasic;

import java.util.Scanner;

public class Mitjana_aritmètica {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float suma = 0;
        float i = 0;

        do {
            System.out.print("Numero: ");
            float n = input.nextFloat();
            if(n == 0) {break;}
            suma += n;
            i++;


        }while(true);
        float mitjana = suma/(i-1);
        System.out.printf("La mitjàna és %f.", mitjana);

    }
}
