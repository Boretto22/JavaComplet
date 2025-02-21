package ActivBasic;

import java.util.Scanner;

public class Mínim_2_num {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Num1?:");
        double Num1 = input.nextDouble();

        System.out.print("Num2?:");
        double Num2 = input.nextDouble();

        Double min = (Num1<Num2) ? Num1:Num2;

        System.out.println("El més petit és:" + min);
    }
}
