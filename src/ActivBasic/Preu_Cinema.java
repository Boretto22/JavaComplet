package ActivBasic;

import java.util.Scanner;

public class Preu_Cinema {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Edat?: ");
        double Edat = input.nextDouble();

        if(Edat<12) {
            System.out.println("El preu és de 5$");
        }else if(Edat<65) {
            System.out.println("El preu és 15$");
        }else{
            System.out.println("El preu és de 10$");

        }
    }
}
