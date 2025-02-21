package ActivBasic;

import java.util.Scanner;

public class GESTIB {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Nota: ");
        double Nota = input.nextDouble();

        double nota = Math.round(Nota);

        if(nota>0 && Nota<5) {
            System.out.println("Suspès");
        }else if(nota<=6) {
            System.out.println("Suficient");
        }else if(nota<=7) {
            System.out.println("Bé");
        }else if(nota<9) {
            System.out.println("Notable");
        }else if(nota<=10) {
            System.out.println("Excelent");
        }else{
            System.out.println("Nota no vàlida");
        }

    }
}
