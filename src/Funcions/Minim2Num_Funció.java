package Funcions;

import java.util.Scanner;

public class Minim2Num_Funció {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        System.out.printf("El minim de %d i %d és %d. ", a, b, minim(a, b));

    }
    public static int minim(int a, int b){
        return (a<b) ? a : b;
    }

    public static int minim2(int a, int b){
        int m;
        if(a<b){
            m = a;
        }
        else {
            m = b;
        }
        return m;
    }
}

