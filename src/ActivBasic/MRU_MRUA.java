package ActivBasic;

import java.util.Scanner;

public class MRU_MRUA {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x0:");
        double x0 = input.nextDouble();

        System.out.print("Enter v:");
        double v0 = input.nextDouble();

        System.out.print("Enter t:");
        double t = input.nextDouble();

        System.out.print("Enter a:");
        double a = input.nextDouble();

        double x = x0 + v0*t + 0.5*a*(t*t);
        System.out.println("La posició final és: "+ x + "m");

        double v = v0 + a*t;
        System.out.println("La velocitat final és: "+ v + "m/s");

    }
}
