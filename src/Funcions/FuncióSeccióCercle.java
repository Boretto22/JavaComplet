package Funcions;

import java.util.Scanner;

public class FuncióSeccióCercle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Input del diametre
        System.out.print("Diàmeter:");
        double diameter = input.nextFloat();

        // Cridada a la funció
        double seccio = seccioCercle(diameter);

        // Output del resultat
        System.out.printf("La secció d'un cercle de dimàmetre %f és: %f.\n", diameter, seccio);
    }

    // Definició de la funció
    public static double seccioCercle(double d){
        return Math.PI * d * d / 4;
    }

}
