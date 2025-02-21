package ActivBasic;

import java.util.Scanner;

public class Arrels_Quadràtiques{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        double a = input.nextDouble();

        System.out.print("b: ");
        double b = input.nextDouble();

        System.out.print("c: ");
        double c = input.nextDouble();

        double d = Math.pow(b, 2) - 4*a*c;

       if(d>0){
        double x1 = (-b + Math.sqrt(d)) / (2*a);
        double x2 = (-b - Math.sqrt(d)) / (2*a);
        System.out.println("Les 2 solucions són: "+x1 + " i "+x2);
    }
        else if(d==0){
        double x = -b / (2*a);
        System.out.println("La solució és: "+x);
    }
        else {
        System.out.println("No hi ha solucions!");
    }

    }
}
