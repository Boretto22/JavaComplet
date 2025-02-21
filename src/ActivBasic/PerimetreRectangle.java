package ActivBasic;

import java.util.Scanner;

public class PerimetreRectangle {

    public static void main(String[] args){

        Scanner floatput = new Scanner(System.in);
        System.out.println("Enter costat1: ");
        float Costat1 = floatput.nextFloat();

        System.out.println("Enter costat2: ");
        float Costat2 = floatput.nextFloat();

        float perimetre = (2 * Costat1) + (2 * Costat2);
        System.out.println("Perimetre = " + perimetre);

    }
}
