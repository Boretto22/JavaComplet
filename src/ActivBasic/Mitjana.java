package ActivBasic;

import java.util.Scanner;

public class Mitjana {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        double Num1 = input.nextDouble();

        System.out.print("Enter Num2: ");
        double Num2 = input.nextDouble();

        System.out.print("Enter Num3: ");
        double Num3 = input.nextDouble();

        double Mitjana = (Num1 + Num2 + Num3)/3.0;
        System.out.print("Mitjana = "+Mitjana);
    }
}
