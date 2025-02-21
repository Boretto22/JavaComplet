package ActivBasic;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class AreaCercle {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = input.nextInt();
        double a = PI * pow(r, 2);
        System.out.println(a);

    }

}
