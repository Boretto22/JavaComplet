package ActivBasic;

import java.util.Scanner;

public class Màxim_2_num {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Num1?:");
        double Num1 = input.nextDouble();

        System.out.print("Num2?:");
        double Num2 = input.nextDouble();

        if(Num1>Num2) {
            System.out.println(Num1 + "És el més gran");
        }else{
            System.out.println(Num2 + "És el més gran");
        }
    }
}
