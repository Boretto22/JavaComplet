package ActivBasic;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float suma = 0;
        do{
            System.out.print("Numero: ");
            float n = input.nextFloat();
            if(n == 0){break;}
            suma += n; // suma = suma + n

        }while (true);
        System.out.printf("La suma és %f.", suma);
    }
}
