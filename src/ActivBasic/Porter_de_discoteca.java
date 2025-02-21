package ActivBasic;

import java.util.Scanner;

public class Porter_de_discoteca {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("La teva edat?: ");
        double Edat = input.nextDouble();

        if(Edat<18) {
            System.out.println("NO POTS PASAR!");
        }else{
            System.out.println("POTS PASAR");
        }
    }
}
